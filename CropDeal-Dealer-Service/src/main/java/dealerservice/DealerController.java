package dealerservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dealerserviceDAO.Dealer;
import dealerserviceService.DealerService;


@RestController
public class DealerController {

	 
	
	
	@Autowired
	DealerService service2;
	

	
	/*@GetMapping("/dealer")
	public List<Dealer> getdealers()
	{
		return service2.Getall();		
		
	}*/
	
		
	@GetMapping("/dealer/{id}")
	public Optional<Dealer> getonedealer(@PathVariable("id")String id)
	{
		return service2.getone(id);		
		
	}
	

	
	@PostMapping("/dealer/add")
	public void addDealer(@RequestBody Dealer dealer)
	{
		service2.addone(dealer);		
		
	}
	
	
	@PutMapping("/dealer/update/{id}")
	public void UpdateDealer(@PathVariable("id")String id ,@RequestBody Dealer dealer)
	{
		service2.update(id, dealer);		
		
	}
	
	
	/*@DeleteMapping("/dealer/delete/{id}")
	public void Deletefarmer(@PathVariable("id")String id)
	{
		service2.delete(id);		
		
	}*/
	
	


}
