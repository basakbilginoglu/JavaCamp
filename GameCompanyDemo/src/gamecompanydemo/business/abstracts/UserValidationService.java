package gamecompanydemo.business.abstracts;

import gamecompanydemo.entities.concretes.Player;

public interface UserValidationService {

	boolean validate(Player player);
}
