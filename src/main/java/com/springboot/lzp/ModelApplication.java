package com.springboot.lzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityResult;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.lzp.entity")
@EnableJpaRepositories(basePackages = "com.springboot.lzp.repository")
@ServletComponentScan(basePackages = "com.springboot.lzp.*")
public class ModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}
}
