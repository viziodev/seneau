package com.seneau.communs.web.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface BaseController <RequestDto,Long,ResponseDto> {
    @PostMapping
    ResponseEntity<ResponseDto>  create(@Valid @RequestBody RequestDto request);
    @GetMapping
    ResponseEntity<List<ResponseDto>> getAll();
    @GetMapping("/paginate")
    ResponseEntity<Map<String, Object>> getAllPaginate(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size);
    @DeleteMapping("/{id}/disable")
    ResponseEntity<Object> disable(@PathVariable Long id);
    @GetMapping("/{id}")
    ResponseEntity<ResponseDto> getById(@PathVariable Long id);
    @PutMapping("/{id}")
    ResponseEntity<ResponseDto> update(@PathVariable Long id, @Valid @RequestBody RequestDto request);
}
