package com.devsuperior.hraconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrconfigServerApplication {

	@Value("${spring.cloud.config.server.git.username}")
	private String username;
	
	@Value("${spring.cloud.config.server.git.password}")
	private String pass;
	
	public static void main(String[] args) {
		SpringApplication.run(HrconfigServerApplication.class, args);
	}

	//para exibir as variáveis de ambiente
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.print("username= " + username );
//		System.out.println("pass= " + pass);
//		
//	}

}
