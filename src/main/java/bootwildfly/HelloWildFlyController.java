package bootwildfly;

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
@RestController
public class HelloWildFlyController {

        	@Autowired
	private CarrierRepository carrierRepository;
        
@Value("${app.team}")
        private String appTeam;
    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly"+appTeam);
    }
        
        @RequestMapping("carriers")
    public Iterable<Carrier> sayHello1(){
        return carrierRepository.findAll();
    }
}
