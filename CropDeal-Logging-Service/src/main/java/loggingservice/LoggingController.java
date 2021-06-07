package loggingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LoggingController {
	
	@GetMapping("/logging")
	public String demo1()
	{
		return "from logging";
		
		
	}
	
	
}
