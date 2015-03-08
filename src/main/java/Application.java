import com.volnoboy.service.CustomerService;
import com.volnoboy.service.CustomerServiceImpl;

/**
 * Created by Reuven on 3/8/15.
 */
public class Application {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
