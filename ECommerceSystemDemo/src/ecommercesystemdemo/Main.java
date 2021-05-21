package ecommercesystemdemo;


import ecommercesystemdemo.business.abstracts.UserService;

import ecommercesystemdemo.business.concretes.UserManager;

import ecommercesystemdemo.core.concretes.GoogleLoginAdapter;
import ecommercesystemdemo.dataAccess.concretes.HibernateUserDao;

import ecommercesystemdemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleLoginAdapter());
		User user = new User(1, "Engin", "Karakuş", "engin@gmail.com", "123456");
		User user1 = new User(2, "Başak", "Bilginoğlu", "basak@gmail.com", "1234567");
	
		userService.add(user);
        userService.add(user1);
      
		
        userService.getAll();

		
		userService.login("basak@gmail.com","1234567");

		
	}

}
