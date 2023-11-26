package com.seneau.agentservice.web.controller.agent.impl;

import com.seneau.agentservice.service.agent.AgentService;
import com.seneau.agentservice.web.controller.agent.AgentController;
import com.seneau.agentservice.web.controller.agent.dto.request.AgentRequest;
import com.seneau.agentservice.web.controller.agent.dto.response.AgentResponse;
import com.seneau.agentservice.web.controller.dto.CvDto;
import com.seneau.agentservice.web.controller.dto.FilterDto;
import com.seneau.communs.data.dto.agent.AgentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AgentControllerImpl implements AgentController {
    private final AgentService agentService;

    @Override
    public ResponseEntity<AgentResponse> create(AgentRequest agentRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(agentService.createData(agentRequest));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> getAll() {
        return ResponseEntity.ok(agentService.getAllData());
    }

    @Override
    public ResponseEntity<Map<String, Object>> getAllPaginate(int page, int size) {
        return ResponseEntity.ok(agentService.getAllDataPaginate(page, size));
    }

    @Override
    public ResponseEntity<Object> disable(Long id) {
        if (agentService.disableData(id) == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Collections.singletonMap("response", false));
        return ResponseEntity.ok(Collections.singletonMap("response", true));
    }


    @Override
    public ResponseEntity<AgentResponse> getById(Long id) {
      return ResponseEntity.ok(agentService.getDataById(id));
    }
    @Override
    public ResponseEntity<Map<String, Object>> getAllAgentFiltered(FilterDto filterDto) {
        return ResponseEntity.ok(agentService.getAllAgentByFilterDto(filterDto));
    }

    @Override
    public ResponseEntity<AgentResponse> getAgentByMatricule(Integer matricule) {
        return ResponseEntity.ok(agentService.getAgentByMatriculeAndActiveTrue(matricule));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> getAllAgentByMatricules(List<Integer> matricules) {
        return ResponseEntity.ok(agentService.getAllAgentByMatriculeIn(matricules));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> getAgentsByMatriculeN1(Integer matriculeManager) {
        return ResponseEntity.ok(agentService.getAllAgentByMatriculeChef(matriculeManager));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> getAgentsByMatriculeDirecteur(Integer matriculeDirecteur) {
        return ResponseEntity.ok(agentService.getAllAgentByMatriculeDirecteur(matriculeDirecteur));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> getAgentsByEtablissement(Long etablissement) {
        return ResponseEntity.ok(agentService.getAllAgentByEtablissement(etablissement));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> getAgentsByDirection(Long direction) {
        return ResponseEntity.ok(agentService.getAllAgentByDirection(direction));
    }

    @Override
    public ResponseEntity<Object> disableByMatricule(Integer matricule) {
        if (agentService.disableByMatricule(matricule) == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Collections.singletonMap("response", false));
        return ResponseEntity.ok(Collections.singletonMap("response", true));
    }



    @Override
    public ResponseEntity<AgentResponseDto> getChefByIdAgent(Long id) {
        return ResponseEntity.ok(agentService.getChefByIdAgent(id));
    }

    @Override
    public ResponseEntity<CvDto> createCv(CvDto cvDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(agentService.createCv(cvDto));
    }

    @Override
    public ResponseEntity<List<AgentResponse>> createAll(MultipartFile file, Integer numberOfSheet) throws IOException, ParseException {
        return ResponseEntity.ok(agentService.createAgentFromFileData(file, numberOfSheet));
    }

    @Override
    public ResponseEntity<AgentResponse> update(Long id, AgentRequest agentRequest) {
        return ResponseEntity.ok(agentService.updateData(id, agentRequest));
    }
}
