package com.comdata.carapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({ "com.comdata.*" })
@ComponentScan({ "com.comdata.*" })
@EnableJpaRepositories({ "com.comdata.*" })
@SpringBootApplication
public class CarApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApiApplication.class, args);
	}

}
