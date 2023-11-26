package com.seneau.communs.service;

import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UploadService {
    private final DataFormatter dataFormatter = new DataFormatter();

    public List<Map<String, String>> getDataFromExcelFile(MultipartFile file, Integer numberOfSheet) throws IOException {
        List<Map<String, String>> fileData = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
        if (numberOfSheet == null || numberOfSheet < 0) {
            numberOfSheet = workbook.getNumberOfSheets();
        }
        for (int i = 0; i < numberOfSheet; i++) {
            Sheet sheet = workbook.getSheetAt(i);
            fileData.addAll(getFileData(sheet));
        }
        return fileData;
    }

    private List<String> getFileHeaders(Row row) {
        Iterator<Cell> cellIterator = row.cellIterator();
        List<String> keys = new ArrayList<>();
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            keys.add(dataFormatter.formatCellValue(cell).trim());
        }
        return keys;
    }

    private List<Map<String, String>> getFileData(Sheet sheet) {
        List<Map<String, String>> fileData = new ArrayList<>();
        List<String> keys = new ArrayList<>();
        Iterator<Row> rowIterator = sheet.rowIterator();
        int j = 0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            if (j == 0) {
                keys = getFileHeaders(row);
            } else {
                if (!keys.isEmpty()) {
                    Map<String, String> values = new HashMap<>();
                    for (String key : keys) {
                        values.put(key, dataFormatter.formatCellValue(row.getCell(keys.indexOf(key))));
                    }
                    fileData.add(values);
                }
            }
            j++;
        }
        return fileData;
    }
}