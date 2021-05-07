package coffeeprojectdemo.entities;

import java.util.Date;

import coffeeprojectdemo.abstracts.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalNumber;
	private int dateOfBirth;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String nationalNumber, int dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalNumber = nationalNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalNumber() {
		return nationalNumber;
	}

	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
