
import java.util.concurrent.*;

public class callableinterface {

        public static void main(String[] args) throws Exception {

            ExecutorService executor = Executors.newSingleThreadExecutor();

            Callable<Integer> task = () -> 5 + 10;

            Future<Integer> result = executor.submit(task);

            System.out.println("Result: " + result.get());

            executor.shutdown();
        }
    }

