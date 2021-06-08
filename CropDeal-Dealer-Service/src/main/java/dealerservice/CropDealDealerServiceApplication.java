package dealerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import dealerserviceService.DealerService;

@SpringBootApplication
@EnableEurekaClient
public class CropDealDealerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealDealerServiceApplication.class, args);
	}
	
	

	@Bean
	public DealerService serice()
	{
		
		return new DealerService();
	}
	

}
