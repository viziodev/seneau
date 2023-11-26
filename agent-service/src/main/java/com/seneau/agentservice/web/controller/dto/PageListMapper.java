package com.seneau.agentservice.web.controller.dto;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PageListMapper {
    public Map<String, Object> getPageToMapObject(Object o, Object o1, Object o2, Object o3) {
        Map<String, Object> response = new HashMap<>();
        response.put("results", o);
        response.put("currentPage", o1);
        response.put("totalItems", o2);
        response.put("totalPages", o3);
        return response;
    }
}
