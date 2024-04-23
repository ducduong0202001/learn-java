package com.demospring.demo;

import com.demospring.demo.otherpakage.Bikini;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"om.demospring.demo.otherpakage","com.demospring.demo"})
@SpringBootApplication
public class DemoSpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringApplication.class, args);
//		Dress dress = context.getBean(Dress.class);
//		dress.wear();

//		Bikini bikini = context.getBean(Bikini.class);
//		bikini.wear();

		GirlFriend girlFriend = context.getBean(GirlFriend.class);
		System.out.println(girlFriend.outfit);
		girlFriend.outfit.wear();
	}

}
