package ecommercesystemdemo.business.concretes;

import java.util.List;

import ecommercesystemdemo.business.abstracts.UserService;
import ecommercesystemdemo.core.abstracts.GoogleEmailService;
import ecommercesystemdemo.core.concretes.Regex;
import ecommercesystemdemo.dataAccess.abstracts.UserDao;

import ecommercesystemdemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleEmailService googleEmailService;
	
	public UserManager(UserDao userDao, GoogleEmailService googleEmailService) {
		super();
		this.userDao = userDao;
		this.googleEmailService = googleEmailService;
	}

	@Override
	public void add(User user) {
		var result = checkNameLenght(user);
		var mail=getByMail(user.getEmail());
		if (result != false 
				&&mail==null
				&&Regex.emailValidate(user.getEmail())) {
			userDao.add(user);
			System.out.println("Activation mail sent");
			googleEmailService.send(user.getEmail(),user.getPassword());
		} else {
			System.out.println("Try again");
		}

	}
     
	@Override
	public User getByMail(String email) {
		return userDao.getByEmail(email);
	}

	private boolean checkNameLenght(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		}
		System.out.println("name ve surname have at least two character.");
		return false;
	}

	@Override
	public List<User> getAll() {
		for (User customer : userDao.getAll()) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
		return userDao.getAll();
	}
	
	@Override
	public void register(User user) {
		if (userCheckIfNull(user) && userExists(user.getEmail())
				&& checkIfPassword(user.getPassword()) && Regex.emailValidate(user.getEmail())) {
			userDao.add(user);
		} else {
			System.out.println("Registered is failed.");
		}

	}

	@Override
	public boolean login(String email,String password) {
	    for (User user:userDao.getAll()) {
	    if (user.getEmail().equals(email) && user.getPassword().equals(password)
				&& loginNullControl(email,password)) {
		System.out.println("Login successful :"+user.getEmail());
	    return true;
		} 
	    }
	    System.out.println("Login Failed");
	    return false;
	}



	@Override
	public boolean userExists(String email) {
		if (getByMail(email) != null) {
			System.out.println("User already exist");
			return false;
		}
		return true;

	}

	public boolean checkIfPassword(String password) {
		if (password.length() < 6) {

			System.out.println("Password must be equals or grater than 6 ");
			return false;
		}

		return true;
	}

	public boolean userCheckIfNull(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("These fields cannot be empty");
		return false;
	}

	public boolean loginNullControl(String email,String password) {
		if (!email.isEmpty() && !password.isEmpty()) {
			return true;
		}
		System.out.println("These fields cannot be empty");
		return false;
	}

}
