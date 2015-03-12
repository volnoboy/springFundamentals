import com.volnoboy.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reuven on 3/8/15.
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
