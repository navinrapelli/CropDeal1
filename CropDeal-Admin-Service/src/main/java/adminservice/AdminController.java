package adminservice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import adminserviceDAO.Admin;
import adminserviceDAO.Crops;
import adminserviceDAO.Dealer;
import adminserviceDAO.Farmer;
import adminserviceService.AdminService;
import adminserviceService.CropService;
import adminserviceService.DealerService;
import adminserviceService.FarmerService;
import io.swagger.annotations.ApiOperation;




@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
     @Autowired
	RestTemplate restTemplate;
	@GetMapping("/admin1/{id}")
	public  List<Farmer> demo1(@PathVariable("id")String id)
	{	
		Farmer far1=restTemplate.getForObject("http://CropDeal-Farmer-Service/farmer/"+id, Farmer.class) ;
				
				return Arrays.asList(far1);		
		
	}	
	/*@HystrixCommand(fallbackMethod = "fallback")
	private String fallback()
	{
		return "request fails";
		
	}*/
	
	@Autowired
	FarmerService service1;
	
    @Autowired
	RestTemplate template;
	
	@Autowired
	CropService service3;
	
	@Autowired
	AdminService service4;
	
	
	@ApiOperation(value="This api is used to add admin ",
		      notes="Admin can register himself in database"
		      )
	@PostMapping("/add")
	public String addadmin(@RequestBody Admin admin)
	{
		 service4.addone(admin);
		return "Successfully added the farmer with id" +admin.getId();		
		
	}
		
	@ApiOperation(value="Admin can view his details",
		      notes="Admin can see his information using this api call"
		      )
	@GetMapping("/{id}")
	public Admin getoneAdmin(@PathVariable("id")String id)
	{
		return service4.getone(id);		
		
	}
	
	
	@ApiOperation(value="Admin can update his information",
		      notes="Using this api admin can upadate his information just passing admin object and id "
		      )
	@PutMapping("/update/{id}")
	public Admin Updateadmin(@PathVariable("id")String id ,@RequestBody Admin admin)
	{
		service4.update(id, admin);
		return admin;		
		
	}
	
	@ApiOperation(value="Admin can delete his information",
		      notes="Admin delete his information"
		      )
	@DeleteMapping("/delete/{id}")
	public void DeleteAdmin(@PathVariable("id")String id)
	{
		service4.delete(id);		
		
	}
	
	
	
	

	@ApiOperation(value="Admin can see the list of all farmers from databse ",
		      notes="Admin get the list of the all Farmers with all the information about farmer"
			      )
	@GetMapping("/farmer")
	public  Object getfarmers()
	{
	     //Farmer  farmer=template.getForObject("http://CropDeal-Farmer-Service/farmer/getall/",Farmer.class);
		Object far1=restTemplate.getForObject("http://CropDeal-Farmer-Service/farmer/getall/",Object.class) ;
				//System.out.println(farmer);
		//return service1.Getall();		
		
			return (far1);
	}
	
		
	/*@GetMapping("/farmer/{id}")
	public Optional<Farmer> getonefarmer(@PathVariable("id")String id)
	{
		return service1.getone(id);		
		
	}*/
	

	
	/*@PostMapping("/admin/farmer/add")
	public void addfarmer(@RequestBody Farmer farmer)
	{
		service1.addone(farmer);		
		
	}
	
	
	@PutMapping("/admin/farmer/update/{id}")
	public void Updatefarmer(@PathVariable("id")String id ,@RequestBody Farmer farmer)
	{
		service1.update(id, farmer);		
		
	}*/
	
	@ApiOperation(value="Delete the farmers inside database",
		      notes="Admin will able to delete farmers with farmer id inside database "
		      )
	@DeleteMapping("/farmer/delete/{id}")
	public void Deletefarmer(@PathVariable("id")String id)
	
	{    
		
	 
		//restTemplate.delete("http://CropDeal-Farmer-Service/farmer/delete/",id);
		service1.delete(id);		
	
	
	}
	
	@Autowired
	DealerService service2;
	
	@ApiOperation(value="Find all the Dealers inside database",
		      notes="Admin get the list of the all Dealers "
		      )
	
	@GetMapping("/dealer")
	public List<Dealer> getdealers()
	{
		return service2.Getall();		
		
	}
	
		
	/*@GetMapping("admin/dealer/{id}")
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
		
	}*/
	

	@ApiOperation(value="Delete by id the Dealer inside database",
		      notes="Admin will able to delete Dealers inside database ")
	@DeleteMapping("/dealer/delete/{id}")
	public void Deletedealer(@PathVariable("id")String id)
	{
		service2.delete(id);		
		
	}
	

	@ApiOperation(value="Admin get all the corps information about all crops inside databse",
		      notes="Admin will get all the information about the crops ")
	  @GetMapping("/crop")
      public List<Crops>getallcrops()
      {
		return service3.Getall();
    	  
    	  
    	  
      }
	
	
/*@GetMapping("/crop/{id}")
public Optional<Crops> getonecrop(@PathVariable("id")String id)
{
	return service3.getone(id);		
	
}



@PostMapping("/crop/add/")
public String addcrop(@RequestBody Crops crop ,@PathVariable("farmerid") String farmerid )
{     
	
	 service3.addone(crop,);
	return "Successfully added the farmer with id" +crop.getId();		
	
}


@PutMapping("/crop/updtae/{id}")
public Crops Updatecrop(@PathVariable("id")String id ,@RequestBody Crops crop)
{
	service3.update(id, crop);
	return crop;		
	
}*/


	@ApiOperation(value="Admin can delte the crops with crop id",
		      notes="Admin can delete the information about the crops")
@DeleteMapping("/crop/delete/{id}")
public void Deletecrop(@PathVariable("id")String id)
{
	service3.delete(id);		
	
}
	
	
	
	
	
	

}
