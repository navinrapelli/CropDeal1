package subscriptionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
	
	@GetMapping("/subscription")
	public String demo1()
	{
		return "from subscription";
		
		
	}

}
