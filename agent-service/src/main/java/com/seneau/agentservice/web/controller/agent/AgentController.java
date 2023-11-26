package com.seneau.agentservice.web.controller.agent;

import com.seneau.agentservice.web.controller.agent.dto.request.AgentRequest;
import com.seneau.agentservice.web.controller.agent.dto.response.AgentResponse;
import com.seneau.agentservice.web.controller.dto.CvDto;
import com.seneau.agentservice.web.controller.dto.FilterDto;
import com.seneau.communs.data.dto.agent.AgentResponseDto;
import com.seneau.communs.web.controller.BaseController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface AgentController extends BaseController<AgentRequest,Long,AgentResponse> {

    @PostMapping("/create/all")
    ResponseEntity<List<AgentResponse>> createAll(@RequestParam MultipartFile file, @RequestParam Integer numberOfSheet) throws IOException, ParseException;

   // @GetMapping
    //ResponseEntity<Map<String, Object>> getAllAgent(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size);
    @PostMapping("/filtered")
    ResponseEntity<Map<String, Object>> getAllAgentFiltered(@RequestBody FilterDto filterDto);
    @GetMapping("/matricule/{matricule}")
    ResponseEntity<AgentResponse> getAgentByMatricule(@PathVariable Integer matricule);
    @PostMapping("/listDtoAgentmatricules/all")
    ResponseEntity<List<AgentResponse>> getAllAgentByMatricules(@RequestBody List<Integer> matricules);
    @GetMapping("/n1/{matriculeManager}")
    ResponseEntity<List<AgentResponse>> getAgentsByMatriculeN1(@PathVariable Integer matriculeManager);
    @GetMapping("/directeur/{matriculeDirecteur}")
    ResponseEntity<List<AgentResponse>> getAgentsByMatriculeDirecteur(@PathVariable Integer matriculeDirecteur);
    @GetMapping("/etablissement/{etablissement}")
    ResponseEntity<List<AgentResponse>> getAgentsByEtablissement(@PathVariable Long etablissement);
    @GetMapping("/directions/{direction}")
    ResponseEntity<List<AgentResponse>> getAgentsByDirection(@PathVariable Long direction);
    @DeleteMapping("/{matricule}/disable")
    ResponseEntity<Object> disableByMatricule(@PathVariable Integer matricule);
    @GetMapping("/chef/{id}")
    ResponseEntity<AgentResponseDto> getChefByIdAgent(@PathVariable Long id);
    @PostMapping("/cv")
    ResponseEntity<CvDto> createCv(@RequestBody CvDto cvDto);

}
