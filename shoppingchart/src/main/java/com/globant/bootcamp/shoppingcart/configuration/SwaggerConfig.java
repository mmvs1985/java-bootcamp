package com.globant.bootcamp.shoppingcart.configuration;

import org.springframework.context.annotation.*;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  //  @Bean SecurityConfiguration security() { return new SecurityConfiguration(null, null, null, null, "Bearer access_token", ApiKeyVehicle.HEADER, "Authorization", ","); }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}