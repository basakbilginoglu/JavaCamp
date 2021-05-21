package ecommercesystemdemo.business.concretes;

import ecommercesystemdemo.business.abstracts.ActivationService;
import ecommercesystemdemo.entities.concretes.User;

public class ActivateManager implements ActivationService {

	@Override
	public void activate(User user) {
		user.setActivationStatus(true);
		
	}

}
