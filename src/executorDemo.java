import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorDemo {

        public static void main(String[] args) {

            // Create an ExecutorService with 2 threads
            ExecutorService executor = Executors.newFixedThreadPool(2);

            // Submit tasks
            executor.execute(() -> {
                System.out.println("Task 1 executed by " +
                        Thread.currentThread().getName());
            });

            executor.execute(() -> {
                System.out.println("Task 2 executed by " +
                        Thread.currentThread().getName());
            });

            // Shutdown executor
            executor.shutdown();
    }

}
