package com.diary.myDiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDiaryApplication.class, args);
	}

}
