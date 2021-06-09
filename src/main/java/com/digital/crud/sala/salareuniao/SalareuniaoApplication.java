package com.digital.crud.sala.salareuniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "package com.digital.crud.sala.salareuniao.controller;")
public class SalareuniaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalareuniaoApplication.class, args);
	}

}
