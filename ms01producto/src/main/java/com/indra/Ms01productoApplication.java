package com.indra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms01productoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms01productoApplication.class, args);
	}

}
