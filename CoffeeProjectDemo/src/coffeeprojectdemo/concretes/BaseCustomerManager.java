package coffeeprojectdemo.concretes;

import coffeeprojectdemo.abstracts.CustomerService;
import coffeeprojectdemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+ " saved to db succesfully ");
	}
}
