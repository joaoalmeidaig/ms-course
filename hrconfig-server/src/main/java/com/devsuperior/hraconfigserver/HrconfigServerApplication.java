package com.devsuperior.hraconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrconfigServerApplication.class, args);
	}

}
