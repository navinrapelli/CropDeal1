package paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@GetMapping("/payment")
	public String demo1()
	{
		return "from Payment";
		
		
	}

}
