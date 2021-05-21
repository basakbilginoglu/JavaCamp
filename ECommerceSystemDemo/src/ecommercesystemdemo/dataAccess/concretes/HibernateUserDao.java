package ecommercesystemdemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommercesystemdemo.dataAccess.abstracts.UserDao;
import ecommercesystemdemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	

	 private List<User>users=new ArrayList<User>();
			 
	 public HibernateUserDao() {
		User use1=new User(1,"Başak","Bilginoğlu","basak@gmail.com","12345");
		User user2=new User(2,"Engin","Demiroğ","engin@gmail.com","54321");
	}

	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Congratulations! "+user.getFirstName()+" You registered to system succesfully");
	   
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Deleted: "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated: "+user.getFirstName() );
		
	}

	@Override
	public User getByEmail(String email) {
		for (User user:users) {
			if(user.getEmail()==email) {
				return user;
			}
		}
	
		return null;
	}

	@Override
	public List<User> getAll() {
	
		return users;
	}

	@Override
	public User getByEmailandPassword(String email, String password) {
	
		for (User user:users) {
			if (user.getEmail()==email && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

}
