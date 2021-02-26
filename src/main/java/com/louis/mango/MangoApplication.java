package com.louis.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Guilin
 */
@SpringBootApplication(scanBasePackages = {"com.louis.mango"})
public class MangoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
	}

}
