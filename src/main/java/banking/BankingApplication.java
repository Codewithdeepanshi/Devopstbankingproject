package banking;

public class BankingApplication {

    public static void main(String[] args) {
        System.out.println("Banking Application is running...");

        // Keep the application running
        while (true) {
            try {
                Thread.sleep(1000); // Sleep for a while (1 second)
            } catch (InterruptedException e) {
                // Handle the interruption
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}
