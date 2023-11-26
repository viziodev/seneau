package com.seneau.communs.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BaseSwaggerConfig implements WebMvcConfigurer {
    protected  String version;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
                .resourceChain(false);
    }

    @Bean
    public OpenAPI openAPI() {
        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.APIKEY)
                .bearerFormat("JWT")
                .scheme("bearer")
                .in(SecurityScheme.In.HEADER)
                .name("Authorization")
                .description("JWT authentication token");
        return new OpenAPI()
                .components(new Components().addSecuritySchemes("jwtScheme", securityScheme))
                .addSecurityItem(new SecurityRequirement().addList("jwtScheme"))
                .info(new Info().title("Sen Eau Data API Docs")
                                 .description("Sen Eau  Data REST API documentation")
                                 .contact(new Contact().name("Birane Baila Wane")
                                 .email( "www.douvewane85@gmail.com")
                                  .url("www.douvewane85@gmail.com"))
                                  .license(new License().name("License of API"))
                                  .version(version))

        ;
    }




}

