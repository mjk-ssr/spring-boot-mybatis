package com.mjk.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.mjk.springboot.mapper")
@SpringBootApplication
public class SpringBoot05MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot05MybatisApplication.class, args);
	}

}

