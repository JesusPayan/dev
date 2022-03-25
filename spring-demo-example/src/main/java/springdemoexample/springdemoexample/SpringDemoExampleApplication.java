package springdemoexample.springdemoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication// Indicates Spring the class tha will Run.
public class SpringDemoExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDemoExampleApplication.class, args);
		System.out.println("Project is Running");


	}

}
