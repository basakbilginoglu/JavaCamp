package coffeeprojectdemo;

import coffeeprojectdemo.adapters.MernisServiceAdapter;
import coffeeprojectdemo.concretes.BaseCustomerManager;
import coffeeprojectdemo.concretes.StarbucksCustomerManager;
import coffeeprojectdemo.entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1,"Başak","Bilginoğlu","123456789",1900);
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		

	}

}
