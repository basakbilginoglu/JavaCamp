package ecommercesystemdemo.core.concretes;

import ecommercesystemdemo.core.abstracts.LoginWithGoogleService;

public class LoginWithGoogle implements LoginWithGoogleService {

	@Override
	public boolean loginWithGoogle(String email, String password) {
		System.out.println("You are registered with google account succesfully");
		return true;
	}

}
