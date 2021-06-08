package farmerservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import farmerserviceDAO.Crops;
import farmerserviceDAO.Farmer;
import farmerserviceService.CropService;
import farmerserviceService.FarmerService;




@RestController
public class FarmerController {
	
	
	//Farmer far=new Farmer("navin");

	/*@GetMapping("/farmer")
	public Farmer demo1()
	{
		return far;
		
		
	}*/
	
	@Autowired
	FarmerService service2;
	

	@Autowired
	CropService service3;
	

	
	/*@GetMapping("/farmer")
	public List<Farmer> getfarmers()
	{
		return service2.Getall();		
		
	}*/
	
		
	@GetMapping("/farmer/{id}")
	public Farmer getonefarmer(@PathVariable("id")String id)
	{
		return service2.getone(id);		
		
	}
	

	
	@PostMapping("/farmer/add")
	public String addfarmer(@RequestBody Farmer farmer)
	{
		 service2.addone(farmer);
		return "Successfully added the farmer with id" +farmer.getId();		
		
	}
	
	
	@PutMapping("/farmer/update/{id}")
	public Farmer Updatefarmer(@PathVariable("id")String id ,@RequestBody Farmer farmer)
	{
		service2.update(id, farmer);
		return farmer;		
		
	}
	
	
	/*@DeleteMapping("/farmer/delete/{id}")
	public void Deletefarmer(@PathVariable("id")String id)
	{
		service2.delete(id);		
		
	}*/
	
	
	
@GetMapping("/farmer/crop/{id}")
public Optional<Crops> getonecrop(@PathVariable("id")String id)
{
	return service3.getone(id);		
	
}



@PostMapping("/farmer/crop/add/{farmerid}")
public String addcrop(@RequestBody Crops crop ,@PathVariable("farmerid") String farmerid )
{     
	
	 service3.addone(crop, farmerid);
	return "Successfully added the farmer with id" +crop.getId();		
	
}


@PutMapping("/farmer/update/crop/{id}")
public Crops Updatecrop(@PathVariable("id")String id ,@RequestBody Crops crop)
{
	service3.update(id, crop);
	return crop;		
	
}


@DeleteMapping("/farmer/delete/crop/{id}")
public void Deletecrop(@PathVariable("id")String id)
{
	service3.delete(id);		
	
}
	
	
	
	
	
	
	
	
	
	
	
	

}
