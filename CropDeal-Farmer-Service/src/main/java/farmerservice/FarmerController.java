package farmerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import farmerdao.Farmer;

@RestController
public class FarmerController {
	
	
	Farmer far=new Farmer("navin");

	@GetMapping("/farmer")
	public Farmer demo1()
	{
		return far;
		
		
	}
	
	

}
