package farmerservice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



import farmerserviceDAO.Farmer;

public class CustomeUserDetails implements UserDetails {

	
	private Farmer farmer;
	
	
	public CustomeUserDetails(Farmer farmer) {
	   
		this.farmer = farmer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		return Collections.singleton(new SimpleGrantedAuthority("farmer"));

	
		
	}

	@Override
	public String getPassword() {

		System.out.println(farmer.getFarmerpassword());
		return farmer.getFarmerpassword();
	
	}

	@Override
	public String getUsername() {
        
		return farmer.getFarmeremail();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	
		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}
