package com.example.testmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestModuleApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestModuleApplication.class, args);
    System.out.println("Test");
  }

}
