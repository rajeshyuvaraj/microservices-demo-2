package com.centime.msdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MicroservicesApp2 {
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApp2.class, args);
	}
}
