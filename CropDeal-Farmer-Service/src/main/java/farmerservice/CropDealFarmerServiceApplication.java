package farmerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CropDealFarmerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealFarmerServiceApplication.class, args);
	}

}
