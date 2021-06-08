package farmerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import farmerserviceService.CropService;
import farmerserviceService.FarmerService;

@SpringBootApplication
@EnableEurekaClient
public class CropDealFarmerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealFarmerServiceApplication.class, args);
	}

	@Bean
	public FarmerService serice()
	{
		
		return new FarmerService();
	}
	
	
	@Bean
	public CropService serice1()
	{
		
		return new CropService();
	}
	
	
	

}
