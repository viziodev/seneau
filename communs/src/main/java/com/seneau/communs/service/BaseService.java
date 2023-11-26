package com.seneau.communs.service;

import com.seneau.communs.data.dto.agent.AgentResponseDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface BaseService<RequestDto,Long,ResponseDto> {

    ResponseDto createData(RequestDto request);

    List<ResponseDto> getAllData();

    Map<String, Object> getAllDataPaginate(int page, int size);

    ResponseDto disableData(Long id);

    ResponseDto getDataById(Long id);

    ResponseDto updateData(Long id, RequestDto request);
}
