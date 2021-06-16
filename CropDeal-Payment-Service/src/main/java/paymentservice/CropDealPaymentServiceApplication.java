package paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import paymentserviceDAO.PaytmPay;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CropDealPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealPaymentServiceApplication.class, args);
	}
	

	@Bean
	public Docket swaggerConfiguration()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("paymentservice"))
				.build();
		
		
	}
	
	@Bean
	public PaytmPay pay()
	{
		return new PaytmPay();
	}


}
