package com.sparta.week3mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA를 사용 할 수 있게함 무조건 선언!
@SpringBootApplication
public class Week3MissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week3MissionApplication.class, args);
	}

}
