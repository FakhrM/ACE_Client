package com.client.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.client.demo.entities.Client;
import com.client.demo.repositories.ClientRepository;

@EnableEurekaServer
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initializeH2Database( ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"),"amine",Float.parseFloat("22")));
			
	};
	}
}
