package dealerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import dealerserviceDAO.Dealer;


public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	DealerRepo repo1;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Dealer dealer=repo1.findByDealeremail(username);
		System.out.println(dealer);
		if(dealer==null)
		{
			throw new UsernameNotFoundException("Could not found user");
		}
		
		CustomeUserDetailsDealer customeuserdetails=new CustomeUserDetailsDealer(dealer);
		return customeuserdetails;
	}

}
