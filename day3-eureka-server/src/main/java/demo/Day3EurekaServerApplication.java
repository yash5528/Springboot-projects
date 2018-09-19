package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Day3EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day3EurekaServerApplication.class, args);
	}
}
