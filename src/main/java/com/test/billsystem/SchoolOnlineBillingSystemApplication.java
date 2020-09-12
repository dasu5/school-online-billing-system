package com.test.billsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.test.billsystem"})
public class SchoolOnlineBillingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolOnlineBillingSystemApplication.class, args);
	}

}
