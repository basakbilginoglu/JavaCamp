package coffeeprojectdemo.adapters;

import java.rmi.RemoteException;

import coffeeprojectdemo.abstracts.CustomerCheckService;
import coffeeprojectdemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = false;

		try {
			KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalNumber()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
		

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return result;
	}

	

}
