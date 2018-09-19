package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@RequestMapping("/")
	public String info() {
		System.out.println("simpleService2 is invoked: loadbalancing example: Same service : different instance");
		return "I am very Simple";
	}

}
