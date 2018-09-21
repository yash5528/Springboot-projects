package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Day4ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day4ZuulApplication.class, args);
	}
}
