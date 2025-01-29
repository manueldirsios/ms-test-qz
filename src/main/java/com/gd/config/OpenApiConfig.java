package com.gd.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
	    info = @Info(
	        title = "User API",
	        version = "1.0",
	        description = "API for managing users"
	    )
	)
public class OpenApiConfig {

}
