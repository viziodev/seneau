package com.seneau.demandeservice.web.controller;

import com.seneau.demandeservice.web.dto.response.DemandeCongeResponseDto;
import com.seneau.demandeservice.web.dto.request.TypeDemandeRequestCreateDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conge")
public interface CongeController {
    @GetMapping("/agent/{id}/status/{status}")
    ResponseEntity<List<DemandeCongeResponseDto>> demandes(@PathVariable Long id, @PathVariable Long status);
    @PostMapping("")
    ResponseEntity<DemandeCongeResponseDto> create(@Valid @RequestBody TypeDemandeRequestCreateDto typeDemandeRequest);
}
