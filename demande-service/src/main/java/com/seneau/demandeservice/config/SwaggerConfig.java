package com.seneau.demandeservice.config;


import com.seneau.communs.config.BaseSwaggerConfig;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig extends BaseSwaggerConfig {
    @Autowired
    public SwaggerConfig(@Value("${spring.application.version}") String version) {
        this.version = version;
    }
    @Bean
    public GroupedOpenApi groupeOpenApi() {
        return GroupedOpenApi.builder()
                .group("sen-eau-demande-service")
                .packagesToScan("com.seneau.demandeservice.web.controller")
                .packagesToExclude("com.seneau.demandeservice.data.model")
                .build();
    }
}