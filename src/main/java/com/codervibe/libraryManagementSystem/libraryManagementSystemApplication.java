package com.codervibe.libraryManagementSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.codervibe.libraryManagementSystem.mapper")
@ServletComponentScan
public class libraryManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(libraryManagementSystemApplication.class, args);
    }
}
