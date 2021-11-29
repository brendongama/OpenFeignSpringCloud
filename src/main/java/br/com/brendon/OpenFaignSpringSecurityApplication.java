package br.com.brendon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFaignSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFaignSpringSecurityApplication.class, args);
	}

}
