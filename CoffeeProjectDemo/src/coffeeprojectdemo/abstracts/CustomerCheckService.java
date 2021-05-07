package coffeeprojectdemo.abstracts;

import coffeeprojectdemo.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
