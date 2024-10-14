
package banking;

import org.testng.Assert;
import org.testng.annotations.Test; // Import the Test annotation

public class bankingApplicationtest {

    @Test // Annotate the method with @Test to indicate it's a test method
    public void testApplicationStarts() {
        System.out.println("Running testApplicationStarts..."); // Print message to indicate the test is running
        Assert.assertTrue(true, "Application should start successfully."); // Placeholder assertion
    }

    @Test // Annotate the method with @Test
    public void testGreeting() {
        System.out.println("Running testGreeting..."); // Print message to indicate the test is running
        // Simulating a greeting message, replace this logic with your actual service call later
        String greeting = "Welcome to the Banking Application!"; // Temporary value
        Assert.assertEquals(greeting, "Welcome to the Banking Application!", "Greeting should match expected value.");
    }
}
