package com.testjenkins.jenkins;

import com.testjenkins.jenkins.entities.Client;
import com.testjenkins.jenkins.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(null,"riadh","yahyaoui"));
			clientRepository.save(new Client(null,"Khalifa","yahyaoui"));
		};
	}

}
