package ecommercesystemdemo.business.abstracts;

import ecommercesystemdemo.entities.concretes.User;

public interface ActivationService {
	void activate(User user);
}
