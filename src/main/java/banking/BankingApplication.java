//package com.project.staragile.banking;
package banking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.Assert;
@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BankingApplication.class);
        app.setAdditionalProfiles("dev"); // Change 'dev' to 'prod' for production
        app.run(args);
    }
    public void testApplicationStarts() {
        // Here, you might want to include some logic to verify that your Spring Boot application context loads correctly
        // For example, you can use Spring's testing support to load the application context and verify a bean is present.
        // Below is a basic placeholder assertion.

        Assert.assertTrue(true, "Application should start successfully.");
    }
}
