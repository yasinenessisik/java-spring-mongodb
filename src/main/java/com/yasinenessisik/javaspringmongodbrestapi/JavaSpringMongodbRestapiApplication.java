package com.yasinenessisik.javaspringmongodbrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class JavaSpringMongodbRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringMongodbRestapiApplication.class, args);
	}

}
