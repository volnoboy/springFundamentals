import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.volnoboy.service.CustomerService;

/**
 * Created by Reuven on 3/8/15.
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		CustomerService customerService2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService);
		System.out.println(customerService2);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
