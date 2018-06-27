package bootwildfly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.lang.Iterable;
import bootwildfly.Carrier;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RefreshScope
public class HelloWildFlyController {
	private static final Logger logger = LoggerFactory.getLogger(HelloWildFlyController.class);

        	@Autowired
	private CarrierRepository carrierRepository;
        
@Value("${appTeam}")
        private String appTeam;
    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly"+appTeam);
    }
        
        @RequestMapping("carriers")
    public Iterable<Carrier> sayHello1(){
	    logger.info("Retrieving carriers from db");
        return carrierRepository.findAll();
    }
}
