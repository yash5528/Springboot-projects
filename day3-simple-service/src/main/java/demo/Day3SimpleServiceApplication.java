package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Day3SimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day3SimpleServiceApplication.class, args);
	}
}
