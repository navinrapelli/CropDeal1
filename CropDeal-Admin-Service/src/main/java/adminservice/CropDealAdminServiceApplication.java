package adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import adminserviceDAO.Farmer;
import adminserviceService.AdminService;
import adminserviceService.CropService;
import adminserviceService.DealerService;
import adminserviceService.FarmerService;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CropDealAdminServiceApplication {
	
	
	
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
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
	public CropService serice1()
	{
		
		return new CropService();
	}

	@Bean
	public AdminService service3()
	{
		return new AdminService();
		
		
	}
	

	@Bean
	public DealerService service1()
	{
		
		return new DealerService();
	}
	
	@Bean
	public Docket swaggerConfiguration()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("adminservice"))
				.build();
		
		
	}
	
	@Bean
	public Farmer far()
	{
		return new Farmer();}
	
	
	

}
