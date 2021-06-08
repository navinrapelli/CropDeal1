package adminservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import adminserviceDAO.Dealer;
import adminserviceDAO.Farmer;
import adminserviceService.DealerService;
import adminserviceService.FarmerService;



@RestController
@EnableHystrix
public class AdminController {
	
	/*@Autowired
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
		
	}*/
	
	@Autowired
	FarmerService service1;
	

	
	@GetMapping("/admin/farmer")
	public List<Farmer> getfarmers()
	{
		return service1.Getall();		
		
	}
	
		
	@GetMapping("/admin/farmer/{id}")
	public Optional<Farmer> getonefarmer(@PathVariable("id")String id)
	{
		return service1.getone(id);		
		
	}
	

	
	@PostMapping("/admin/farmer/add")
	public void addfarmer(@RequestBody Farmer farmer)
	{
		service1.addone(farmer);		
		
	}
	
	
	@PutMapping("/admin/farmer/update/{id}")
	public void Updatefarmer(@PathVariable("id")String id ,@RequestBody Farmer farmer)
	{
		service1.update(id, farmer);		
		
	}
	
	
	@DeleteMapping("/admin/farmer/delete/{id}")
	public void Deletefarmer(@PathVariable("id")String id)
	{
		service1.delete(id);		
		
	}
	
	
	@Autowired
	DealerService service2;
	

	
	@GetMapping("admin/dealer")
	public List<Dealer> getdealers()
	{
		return service2.Getall();		
		
	}
	
		
	@GetMapping("admin/dealer/{id}")
	public Optional<Dealer> getonedealer(@PathVariable("id")String id)
	{
		return service2.getone(id);		
		
	}
	

	
	@PostMapping("admin/dealer/add")
	public void adddealer(@RequestBody Dealer dealer)
	{
		service2.addone(dealer);		
		
	}
	
	
	@PutMapping("admin/dealer/update/{id}")
	public void Updatedealer(@PathVariable("id")String id ,@RequestBody Dealer dealer)
	{
		service2.update(id, dealer);		
		
	}
	
	
	@DeleteMapping("admin/dealer/delete/{id}")
	public void Deletedealer(@PathVariable("id")String id)
	{
		service2.delete(id);		
		
	}
	
	
	
	
	
	
	

}
