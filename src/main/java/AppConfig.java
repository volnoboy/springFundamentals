import com.volnoboy.service.CustomerService;
import com.volnoboy.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/13/15 11:51 AM
 */
@Configuration
@ComponentScan({"com.volnoboy"})
public class AppConfig {

	@Bean(name = "customerService")
	@Scope("singleton")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService;
	}
}
