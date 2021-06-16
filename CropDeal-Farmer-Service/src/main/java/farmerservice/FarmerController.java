package farmerservice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import farmerserviceDAO.Crops;
import farmerserviceDAO.Farmer;
import farmerserviceDAO.MsgConfirm;
import farmerserviceService.CropService;
import farmerserviceService.FarmerService;
import io.swagger.annotations.ApiOperation;





@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/farmer")
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
	

	
	@GetMapping("/getall")
	public List<Farmer> getfarmers()
	{
		return service2.Getall();		
		
	}
	
	
	/*@GetMapping("/name")
	public Farmer getfarmername()
	{
		return service2.getFarmerr();
		
		
	}*/
	
	/*@GetMapping("/hh")
	public String getonedd()
	{
		return "welcome";		
		
	}*/
	@ApiOperation(value="Farmer can create his profile or register himself ",
		      notes="using this api farmer can add all information about hismself name,bankdetails,address etc"
		      )	
	@PostMapping("/add")
	public String addfarmer(@RequestBody Farmer farmer)
	{
		 service2.addone(farmer);
		return "Successfully added the farmer with id" +farmer.getId();		
		
	}
	
	
	@ApiOperation(value="Farmer can view his details",
		      notes="Using this api farmer can view his details name,address and all"
		      )	
	@GetMapping("/{id}")
	public Farmer getonefarmer(@PathVariable("id")String id)
	{
		return service2.getone(id);		
		
	}
	
	@ApiOperation(value="Farmer can update his information",
		      notes="Using this api farmer update his all information"
		      )	
	@PutMapping("/update/{id}")
	public Farmer Updatefarmer(@PathVariable("id")String id ,@RequestBody Farmer farmer)
	{
		service2.update(id, farmer);
		return farmer;		
		
	}
	

	@ApiOperation(value="Farmer can delete his information",
		      notes="Using this api farmer update his all information"
		      )	
	@DeleteMapping("/delete/{id}")
	public void Deletefarmer(@PathVariable("id")String id)
	{
		service2.delete(id);		
		
	}
	
	@ApiOperation(value="Farmer can add his crop information",
		      notes="Using this api farmer add crops information"
		      )	
	@PostMapping("/crop/add/{farmerid}")
	public String addcrop(@RequestBody Crops crop ,@PathVariable("farmerid") String farmerid )
	{     
		
		 service3.addone(crop, farmerid);
		return "Successfully added the farmer with id" +crop.getId();		
		
	}
	

	@ApiOperation(value="Farmer can view his crop details",
		      notes="Using this api farmer can view his crop deatils"
		      )	
@GetMapping("/crop/{id}")
public Optional<Crops> getonecrop(@PathVariable("id")String id)
{
	return service3.getone(id);		
	
}

	@ApiOperation(value="Farmer can update his crop details",
		      notes="Using this api farmer can update his crop deatils"
		      )	
@PutMapping("/crop/update/{id}")
public Crops Updatecrop(@PathVariable("id")String id ,@RequestBody Crops crop)
{
	service3.update(id, crop);
	return crop;		
	
}

	
	@ApiOperation(value="Farmer can delete his crop details",
		      notes="Using this api farmer can delete his crop deatils"
		      )	
@DeleteMapping("/crop/delete/{id}")
public void Deletecrop(@PathVariable("id")String id)
{
	service3.delete(id);		
	
}
	
	@ApiOperation(value="Farmer can see the crop subscribed details by dealer",
		      notes="Using this api farmer can view the information about dealer who subscribed to his crop"
		      )	
@GetMapping("/msg/{farmerid}")
public MsgConfirm shomsg(MsgConfirm con,@PathVariable("farmerid")String id1)
{    
	
	Farmer farm=service2.getone(id1);

	return farm.getMessages();
	
	
}
	
	
	
	
	
	

}
