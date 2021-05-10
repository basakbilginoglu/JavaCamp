package gamecompanydemo.adapters;

import java.rmi.RemoteException;

import gamecompanydemo.business.abstracts.UserValidationService;
import gamecompanydemo.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean validate(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					player.getIdentityNumber(), 
					player.getFirstName().toUpperCase(), 
					player.getLastName().toUpperCase(), 
					player.getDateOfBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
