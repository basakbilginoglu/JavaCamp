package ecommercesystemdemo.dataAccess.abstracts;

import java.util.List;

import ecommercesystemdemo.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete (User user);
	void update(User user);
	User getByEmail(String email);
	List<User> getAll();
	User getByEmailandPassword(String email,String password);
	
}
