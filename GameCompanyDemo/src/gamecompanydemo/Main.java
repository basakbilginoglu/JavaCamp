package gamecompanydemo;

import java.time.LocalDate;

import gamecompanydemo.adapters.MernisServiceAdapter;
import gamecompanydemo.business.concretes.CampaignManager;
import gamecompanydemo.business.concretes.GameManager;
import gamecompanydemo.business.concretes.PlayerManager;
import gamecompanydemo.business.concretes.SalesManager;
import gamecompanydemo.entities.concretes.Campaign;
import gamecompanydemo.entities.concretes.Game;
import gamecompanydemo.entities.concretes.Player;

public class Main {
	public static void main(String[] args) {
		PlayerManager customerManager = new PlayerManager(new MernisServiceAdapter());
		Player player = new Player(1,"Başak ","Bilginoğlu",1900,123456789L);
		customerManager.add(player);
     
		
		GameManager gameManager =new GameManager();
		Game game = new Game(1, "gTA", "Aksiyon", 145);
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "%25 publisher discount campaign", 0.25);
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sales(player, game);
		salesManager.salesWithCampaign(player, game, campaign);
	}

	

}
