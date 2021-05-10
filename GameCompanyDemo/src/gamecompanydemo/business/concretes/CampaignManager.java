package gamecompanydemo.business.concretes;

import gamecompanydemo.business.abstracts.CampaignService;
import gamecompanydemo.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public  void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " added succesfully");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " deleted succesfully");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " updated succesfully");
		
	}

}
