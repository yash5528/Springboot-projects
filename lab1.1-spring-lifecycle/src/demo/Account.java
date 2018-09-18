package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Account implements BeanNameAware, ApplicationContextAware, InitializingBean {
	
	ApplicationContext ctx;
	String beanName;
	float amt=111;
	
	public Account() 
	{
		System.out.println("Lifecycle Step 1....Instantiate");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Lifecycle Step 6..@PostConstruct");
	}
	
	public void start() {
		
		System.out.println("Lifecycle Step 8...Custom Init Method");
	}
	

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		System.out.println("Lifecycle Step 2..dependency injection");
		this.amt = amt;
	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		
		beanName=arg0;
		System.out.println("Lifecycle Step 3..bean name aware " + beanName);
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		ctx=arg0;
		System.out.println("Lifecycle Step 4..ApplicationContextAware" + ctx);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Lifecycle Step 7..Initializing Bean");
		
	}

}
