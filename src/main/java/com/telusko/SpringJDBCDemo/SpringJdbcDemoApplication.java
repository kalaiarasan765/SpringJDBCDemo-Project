package com.telusko.SpringJDBCDemo;

import com.telusko.SpringJDBCDemo.Repository.AlienRepository;
import com.telusko.SpringJDBCDemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Alien alien1=context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("karthi");
		alien1.setTech("java");

		AlienRepository repo=context.getBean(AlienRepository.class);
		repo.save(alien1);
		System.out.println(repo.findAll());
	}

}
