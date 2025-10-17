package com.hospital.paciente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PacienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacienteApplication.class, args);
	}

}
