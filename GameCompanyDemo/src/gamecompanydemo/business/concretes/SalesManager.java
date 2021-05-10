package gamecompanydemo.business.concretes;

import gamecompanydemo.business.abstracts.PlayerService;
import gamecompanydemo.business.abstracts.SalesService;
import gamecompanydemo.entities.concretes.Campaign;
import gamecompanydemo.entities.concretes.Game;
import gamecompanydemo.entities.concretes.Player;

public class SalesManager implements SalesService{

	@Override
	public void sales(Player player, Game game) {
		System.out.println(game.getGameName() +" sold to: " +player.getFirstName()  );
		
	}

	@Override
	public void salesWithCampaign(Player player, Game game, Campaign campaign) {
		System.out.println(game.getGameName() +" sold to: " +player.getFirstName() +" with " +campaign.getCampaignName()  );
	}

}
