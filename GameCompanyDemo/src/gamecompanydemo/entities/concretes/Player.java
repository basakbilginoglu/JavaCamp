package gamecompanydemo.entities.concretes;

import java.time.LocalDate;


import gamecompanydemo.entities.abstracts.Entity;

public class Player implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private Long identityNumber;
	
	public Player() {
		
	}

	public Player(int id, String firstName, String lastName, int dateOfBirth, long identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.identityNumber = identityNumber;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(Long identityNumber) {
		this.identityNumber = identityNumber;
	}

}