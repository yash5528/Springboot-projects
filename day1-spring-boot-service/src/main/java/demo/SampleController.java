package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/sample")
	public Customer disp() {
		Customer customer = new Customer();
		return customer ;
	}
	
}
