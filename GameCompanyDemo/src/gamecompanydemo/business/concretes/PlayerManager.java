package gamecompanydemo.business.concretes;

import gamecompanydemo.business.abstracts.PlayerService;
import gamecompanydemo.business.abstracts.UserValidationService;
import gamecompanydemo.entities.concretes.Player;

public class PlayerManager implements PlayerService {

	UserValidationService validationService;
	
	public PlayerManager(UserValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Player player) {
		if(validationService.validate(player)) {
			
			System.out.println(player.getFirstName()+ " added succesfully");
		}
		
		else {
		
			System.out.println(" Not a valid person");
		}
		
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+ " deleted succesfully");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+ " updated succesfully");
		
	}

}
