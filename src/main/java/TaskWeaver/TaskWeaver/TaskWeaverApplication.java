package TaskWeaver.TaskWeaver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TaskWeaverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskWeaverApplication.class, args);
	}
	@GetMapping(value = "/")
	public String helloWorld() {
		return "CI/CD PLEASE";
	}

}
