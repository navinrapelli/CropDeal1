package adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import adminserviceService.DealerService;
import adminserviceService.FarmerService;




@SpringBootApplication
@EnableEurekaClient
public class CropDealAdminServiceApplication {
	
	
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate()
	{
		
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(CropDealAdminServiceApplication.class, args);
	}
	
	
	@Bean
	public FarmerService service()
	{
		
		return new FarmerService();
	}

	

	@Bean
	public DealerService service1()
	{
		
		return new DealerService();
	}
	
	
	

}
