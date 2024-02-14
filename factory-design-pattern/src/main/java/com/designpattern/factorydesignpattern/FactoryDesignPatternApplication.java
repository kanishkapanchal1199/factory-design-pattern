package com.designpattern.factorydesignpattern;

import com.designpattern.factorydesignpattern.phone.OS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FactoryDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryDesignPatternApplication.class, args);


		OSFactory os=new OSFactory();
		OS obj=os.getInstance("Open");
		obj.spec();

	}

}
