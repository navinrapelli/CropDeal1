package farmerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import farmerserviceDAO.Farmer;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	FarmerRepo repo1;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Farmer farmer=repo1.findByFarmeremail(username);
		System.out.println(farmer);
		if(farmer==null)
		{
			throw new UsernameNotFoundException("Could not found user");
		}
		
		CustomeUserDetails customeuserdetails=new CustomeUserDetails(farmer);
		return customeuserdetails;
	}

}
