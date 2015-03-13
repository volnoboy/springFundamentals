import com.volnoboy.repository.CustomerRepository;
import com.volnoboy.repository.HibernateCustomerRepositoryImpl;
import com.volnoboy.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.volnoboy.service.CustomerService;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/13/15 11:51 AM
 */
@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
