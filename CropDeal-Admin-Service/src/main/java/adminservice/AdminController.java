package adminservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import adminserviceDAO.Farmer;

@RestController
@EnableHystrix
public class AdminController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/admin1")
	@HystrixCommand(fallbackMethod = "fallback")
	public  String demo1()
	{
		
		Farmer far1=restTemplate.getForObject("http://CropDeal-Farmer-Service/farmer", Farmer.class) ;
				
				return "from 1 admin"+far1;
		
		
	}
	
	
	private String fallback()
	{
		return "request fails";
		
	}
	
	
	
	
	

}
