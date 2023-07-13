package com.example.restApi.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class OpenApiConfig {
	
	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Employee CRUD - Spring Boot Swagger Configuration")
                        .description("\"Swagger configuration for application \""));

}
}
