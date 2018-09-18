package demo;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringBootWebApplication extends SpringBootServletInitializer {
	
	static final String Service_URL="http://localhost:8080/sample";
	
	RestTemplate restTemplate= new RestTemplate();

	@RequestMapping("/info")
	public Customer disp() {
		
		Customer result = restTemplate.getForObject(Service_URL, Customer.class);
		
		
		return result ;
	}
	
}
