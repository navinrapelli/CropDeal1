package dealerservice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import dealerserviceDAO.Dealer;




public class CustomeUserDetailsDealer implements UserDetails {

	
	private Dealer dealer;
	
	
	public CustomeUserDetailsDealer(Dealer dealer) {
	   
		this.dealer = dealer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		return Collections.singleton(new SimpleGrantedAuthority("dealer"));

	
		
	}

	@Override
	public String getPassword() {

		System.out.println(dealer.getDealerpassword());
		return dealer.getDealerpassword();
	
	}

	@Override
	public String getUsername() {
        
		return dealer.getDealeremail();
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
