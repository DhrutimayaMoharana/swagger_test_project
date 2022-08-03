package com.swagPack.test.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.util.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(Predicates.negate(RequestHandlerSelectors.basePackage("com.swagPack.test"))).build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Contact Profile API")
				.description("This API can be used to get profile level actions and information for an contact")
				.version("V1.0").build();
	}
	
}
