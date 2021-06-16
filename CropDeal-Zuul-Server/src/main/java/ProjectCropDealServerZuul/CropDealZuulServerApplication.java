package ProjectCropDealServerZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
@EnableSwagger2
public class CropDealZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDealZuulServerApplication.class, args);
	}

}
