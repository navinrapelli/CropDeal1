package farmerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import farmerserviceDAO.Farmer;
import farmerserviceService.CropService;
import farmerserviceService.FarmerService;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CropDealFarmerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealFarmerServiceApplication.class, args);
	}

	@Bean
	public FarmerService service2 ()
	{
		
		return new FarmerService();
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
				.apis(RequestHandlerSelectors.basePackage("farmerservice"))
				.build();
		
		
	}
	
    /*@Bean
	public Farmer farmmm()
	{
		return new Farmer();
		
	}*/
	

}
