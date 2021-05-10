package gamecompanydemo.business.concretes;

import gamecompanydemo.business.abstracts.GameService;
import gamecompanydemo.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " added succesfully");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " deleted succesfully");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " updated succesfully");
		
	}

}
