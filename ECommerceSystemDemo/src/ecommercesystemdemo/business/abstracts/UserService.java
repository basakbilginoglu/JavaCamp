package ecommercesystemdemo.business.abstracts;

import java.util.List;

import ecommercesystemdemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	User getByMail(String email);
	List<User> getAll();
	void register(User user);
	boolean login(String email,String password);

	boolean userExists(String email);
}
