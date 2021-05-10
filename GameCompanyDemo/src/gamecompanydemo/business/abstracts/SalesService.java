package gamecompanydemo.business.abstracts;

import gamecompanydemo.entities.concretes.Campaign;
import gamecompanydemo.entities.concretes.Game;
import gamecompanydemo.entities.concretes.Player;

public interface SalesService {

	void sales(Player player,Game game);
	void salesWithCampaign(Player player,Game game,Campaign campaign);
}
