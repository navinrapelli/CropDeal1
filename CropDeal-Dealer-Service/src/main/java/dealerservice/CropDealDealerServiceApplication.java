package dealerservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import dealerserviceDAO.Farmer;
import dealerserviceService.CropService;
import dealerserviceService.DealerService;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CropDealDealerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealDealerServiceApplication.class, args);
	}
	
	

	@Bean
	public DealerService serice()
	{
		
		return new DealerService();
	}
	
	@Bean
	public CropService serice1()
	{
		
		return new CropService();
	}
	
	
	@Bean
	public Docket swaggerConfiguration()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("dealerservice"))
				.build();
		
		
	}
	
	

	
	@Bean
	public Farmer far() {
		return new  Farmer();
		
		
	}
	
	
	

}
