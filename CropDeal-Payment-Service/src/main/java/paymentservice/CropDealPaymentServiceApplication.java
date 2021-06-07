package paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CropDealPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealPaymentServiceApplication.class, args);
	}

}
