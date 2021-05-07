package coffeeprojectdemo.concretes;

import coffeeprojectdemo.abstracts.CustomerCheckService;
import coffeeprojectdemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void add(Customer customer) {
	
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
		}
		
		else {
		
			System.out.println(" No valid person");
		}
		
	}
	

}
