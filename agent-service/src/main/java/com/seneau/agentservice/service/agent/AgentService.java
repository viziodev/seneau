package com.seneau.agentservice.service.agent;

import com.seneau.agentservice.web.controller.agent.dto.request.AgentRequest;
import com.seneau.agentservice.web.controller.agent.dto.response.AgentResponse;
import com.seneau.agentservice.web.controller.dto.CvDto;
import com.seneau.agentservice.web.controller.dto.FilterDto;
import com.seneau.communs.data.dto.agent.AgentResponseDto;
import com.seneau.communs.service.BaseService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface AgentService extends BaseService<AgentRequest,Long,AgentResponse> {

    List<AgentResponse> createAgentFromFileData(MultipartFile multipartFile, Integer numberOfSheet) throws IOException, ParseException;
    Map<String, Object> getAllAgentByFilterDto(FilterDto filterDto);
    List<AgentResponse> getAllAgentByMatriculeIn(List<Integer> matricules);
    List<AgentResponse> getAllAgentByMatriculeChef(Integer matricule);
    List<AgentResponse> getAllAgentByMatriculeDirecteur(Integer matricule);
    List<AgentResponse> getAllAgentByEtablissement(Long etablissementId);
    List<AgentResponse> getAllAgentByDirection(Long directionId);
    AgentResponse getAgentByMatriculeAndActiveTrue(Integer matricule);
    AgentResponse disableByMatricule(Integer matricule);
    AgentResponseDto getChefByIdAgent(Long id);
    CvDto createCv(CvDto cvDto);
}
