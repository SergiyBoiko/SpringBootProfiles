package com.ghub.sergiy.boiko;

import com.ghub.sergiy.boiko.carparts.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringBootProfilesApplication {

	@Autowired
	Car car;

	 @RequestMapping("/")
     public String carToString() {
		 return car.toString();
	 }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}
}
