package org.tnsif.springwebapp;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringwebappApplication.class, args);
		Scanner sc=new Scanner(System.in);
		HomeController h=context.getBean(HomeController.class);
		h.home();
	}

}
