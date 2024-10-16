//package com.project.staragile.banking;
package banking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BankingApplication.class);
        app.setAdditionalProfiles("dev"); // Change 'dev' to 'prod' for production
        app.run(args);
    }
  
}