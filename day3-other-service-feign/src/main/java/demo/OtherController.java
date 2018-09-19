package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {
	
	@Autowired
	SimpleService simple;

	@RequestMapping("/")
	public String display() {
		
		String msg= simple.info();
		return msg + "...always with mindfullness";
	}
	
}
