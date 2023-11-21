package sg.edu.nus.iss.Day11Lecture;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class Day11LectureApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Day11LectureApplication.class, args);

		SpringApplication app = new SpringApplication(Day11LectureApplication.class);

		// Default port.
		String port = "8080";
		ApplicationArguments argumentOptions = new DefaultApplicationArguments(args); // For detecting any arguments.

		// Example of your command:
		// mvn spring-boot:run -Dspring-boot.run.arguments="--port=5050"

		if (argumentOptions.containsOption("port")) { // Checks if our arguments given contains a port.
			port = argumentOptions.getOptionValues("port").get(0);
		}

		// Apply the port for the DEFAULT PROPERTIES
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

		System.out.println("Hello, this is my first application!!! TESTING TESTING");
	}

	@Bean
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);

		return logger;
	}

}
