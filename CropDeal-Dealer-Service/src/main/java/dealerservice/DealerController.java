package dealerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealerController {

	
	

	@GetMapping("/dealer")
	public String demo1()
	{
		return "from dealer";
		
		
	}
}
