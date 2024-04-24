package com.demospring.demo;


import com.demospring.demo.Controller.StudenController;
import com.demospring.demo.Dto.StudenDto;
import com.demospring.demo.entity.Student;
import com.demospring.demo.repository.StudenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;
@SpringBootApplication
public class DemoSpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringApplication.class, args);
		StudenController studentRepository = context.getBean(StudenController.class);
		studentRepository.findById(1);


//		Dress dress = context.getBean(Dress.class);
//		dress.wear();

//		Bikini bikini = context.getBean(Bikini.class);
//		bikini.wear();
//
//		GirlFriend girlFriend = context.getBean(GirlFriend.class);
//		System.out.println(girlFriend.outfit);
//		girlFriend.outfit.wear();
	}

}
