package com.tipocambio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PartidasdocumentalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartidasdocumentalesApplication.class, args);
	}

}
