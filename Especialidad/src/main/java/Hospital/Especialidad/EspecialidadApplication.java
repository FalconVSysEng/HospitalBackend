package Hospital.Especialidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EspecialidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(EspecialidadApplication.class, args);
	}

}
