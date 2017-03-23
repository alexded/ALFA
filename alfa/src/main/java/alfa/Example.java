package alfa;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Example {
	
	@RequestMapping("/resource")
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<>();
		model.put( "id", UUID.randomUUID().toString() );
		model.put( "content", "Hello World! " + LocalDateTime.now());
		return model;
	}
	
	public static void main(String[] args) {
		SpringApplication.run( Example.class, args );
	}

}
