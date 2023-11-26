package com.seneau.agentservice.web.controller.dto;

import com.seneau.agentservice.data.model.*;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class FileMapper {
    public Date stringToDate(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(date);
    }
    public List<Agent> toAgent(List<Map<String, String>> fileDate) throws ParseException {
        List<Agent> agents = new ArrayList<>();
        List<String> headers = Arrays.asList("matricule", "prenomCollaborateur", "nomCollaborateur", "situationMatrimoniale", "dateNaissance", "dateEntree", "dateRetraite", "groupe", "statut", "contrat", "fonction", "encadrement", "roleLibelle", "nomN1", "matriculeN1", "nomN2", "matriculeN2", "taux", "cf", "ci", "sexe", "direction", "affectation", "service", "etablissement", "email");
        if (!fileDate.isEmpty()) {
            for (Map<String, String> data : fileDate) {
                Contrat contrat = new Contrat();
                contrat.setDateDebut(stringToDate(data.get(headers.get(5))));
                contrat.setDateRetraite(stringToDate(data.get(headers.get(6))));
                TypeContrat typeContrat = new TypeContrat();
                typeContrat.setName(data.get(headers.get(9)));
                contrat.setTypeContrat(typeContrat);
                Statut statut = new Statut();
                statut.setName(data.get(headers.get(8)));
                Fonction fonction = new Fonction();
                fonction.setName(data.get(headers.get(10)));
                Agent chef = new Agent();
                chef.setMatricule(Integer.parseInt(data.get(headers.get(14))));
                Direction direction = new Direction();
                direction.setName(data.get(headers.get(21)));
                Service service = new Service();
                service.setName(data.get(headers.get(23)));
                Etablissement etablissement = new Etablissement();
                etablissement.setName(data.get(headers.get(24)));
                Agent agent = new Agent();
                agent.setMatricule(Integer.parseInt(data.get(headers.get(0))));
                agent.setFullName(data.get(headers.get(1)) + " " + data.get(headers.get(2)));
                agent.setSituationMatrimoniale(data.get(headers.get(3)));
                agent.setDateNaissance(stringToDate(data.get(headers.get(4))));
                agent.setEmail(data.get(headers.get(25)));
                agent.setCin(data.get(headers.get(19)));
                String taux = "";
                if (data.get(headers.get(17)).contains(",")) {
                    String target = ",";
                    String replacement = ".";
                    taux = data.get(headers.get(17)).replace(target, replacement);
                }
                agent.setTaux(Double.parseDouble(taux));
                agent.setSexe(data.get(headers.get(20)));
                agent.setStatut(statut);
                agent.setFonction(fonction);
                agent.setChef(chef);
                agent.setDirection(direction);
                agent.setService(service);
                agent.setEtablissement(etablissement);

                agents.add(agent);
            }
        }
        return agents;
    }
}
