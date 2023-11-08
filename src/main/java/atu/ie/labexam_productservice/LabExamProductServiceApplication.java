package atu.ie.labexam_productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabExamProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabExamProductServiceApplication.class, args);
	}

}
