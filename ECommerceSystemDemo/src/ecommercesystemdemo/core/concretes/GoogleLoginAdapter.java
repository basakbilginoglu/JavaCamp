package ecommercesystemdemo.core.concretes;

import ecommercesystemdemo.core.abstracts.GoogleEmailService;

public class GoogleLoginAdapter implements GoogleEmailService {

	@Override
	public void send(String email, String message) {

     LoginWithGoogle googleLogin=new LoginWithGoogle();
     googleLogin.loginWithGoogle(email, message);
		
	}
}