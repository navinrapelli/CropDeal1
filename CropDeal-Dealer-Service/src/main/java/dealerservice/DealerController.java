package dealerservice;

import java.util.List;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
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
import org.springframework.web.client.RestTemplate;

import dealerserviceDAO.Crops;
import dealerserviceDAO.Dealer;
import dealerserviceDAO.Farmer;
import dealerserviceDAO.MsgConfirm;
import dealerserviceDAO.SubCrop;
import dealerserviceService.CropService;
import dealerserviceService.DealerService;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/dealer")
public class DealerController {

	 
	
	
	@Autowired
	DealerService service2;
	
	@Autowired
	CropService service3;
	

	
	/*@GetMapping("/dealer")
	public List<Dealer> getdealers()
	{
		return service2.Getall();		
		
	}*/
	
	
	@ApiOperation(value="Dealer can create his profile or register himself ",
		      notes="using this api dealer can add all information about hismself name,bankdetails,address etc"
		      )	
	@PostMapping("/add")
	public void addDealer(@RequestBody Dealer dealer)
	{
		service2.addone(dealer);		
		
	}

	@ApiOperation(value="Dealer can view his details",
		      notes="Using this api Dealer can view his details name,address and all"
		      )
	@GetMapping("/{id}")
	public Dealer getonedealer(@PathVariable("id")String id)
	{
		return service2.getone(id);		
		
	}
	
	@ApiOperation(value="Dealer can update his information",
		      notes="Using this api dealer update his all information"
		      )	
	@PutMapping("/update/{id}")
	public void UpdateDealer(@PathVariable("id")String id ,@RequestBody Dealer dealer)
	{
		service2.update(id, dealer);		
		
	}
	

	@ApiOperation(value="Dealer can delete his information",
		      notes="Using this api dealer update his all information"
		      )	
	@DeleteMapping("/dealer/delete/{id}")
	public void Deletefarmer(@PathVariable("id")String id)
	{
		service2.delete(id);		
		
	}	
	@ApiOperation(value="Dealer can see all the crops",
		      notes="Using this api dealer can see all the crop and subscribed to it"
		      )
	   @GetMapping("/crops")
      public List<Crops>getallcrops()
      {
		return service3.Getall();
    	  
    	  
    	  
      }
	   
	   @Autowired
		private RabbitTemplate template;
	   
	   
	   @ApiOperation(value="Dealer can subscribe to the crop which he want",
			      notes="Using this api dealer can subscribe to crops and message is gone to the farmer of paritcular crop"
			      )
		@PostMapping("/crop/subscribe/{dealerid}/{cropid}")
		public String CropSubscrioption(@PathVariable("cropid")String cropid,@PathVariable("dealerid")String id) {
			
			Dealer dealer=service2.getone(id);
			System.out.println(dealer);
			MsgConfirm con= new MsgConfirm();
			Crops crop=service3.getone(cropid);

			   String farmerid=crop.getUplodedby();
			   String farmername=crop.getSellername();
			
			      SubCrop sub= dealer.getDealersubcropdeatils();
			      sub.setFarmer_name(farmername);
			      sub.setCrop_name(crop.getCrop_name());
			con.setFarmer_id(farmerid);
			con.setDealer_id(dealer.getId());
			con.setDealer_name(dealer.getDealername());
			con.setDealer_No(dealer.getDealercontactno());
			con.setMessage("The dealer is subscribed to this crop "+crop.getCrop_name());
			   //Farmer farmer=resTemplate.getForObject("http://CropDeal-Dealer-Service/farmer/update/"+cropid,Farmer.class);
			   
			  System.out.println(con);
			  
			template.convertAndSend(MsgConfig.EXCHANE,MsgConfig.ROUTING_KEY, con);
			
			return "SUCESS";
		
	}

}
