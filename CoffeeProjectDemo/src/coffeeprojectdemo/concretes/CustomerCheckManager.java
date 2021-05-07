package coffeeprojectdemo.concretes;

import coffeeprojectdemo.abstracts.CustomerCheckService;
import coffeeprojectdemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
	
		return true;
	}

}
