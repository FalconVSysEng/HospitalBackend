package com.hospital.tipo_analisis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TipoAnalisisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TipoAnalisisApplication.class, args);
	}

}
