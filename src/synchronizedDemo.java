public class synchronizedDemo {

        synchronized void printDocument(String threadName) {
            System.out.println(threadName + " entered printDocument()");

//            try {
//                Thread.sleep(1000); // simulate printing
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(threadName + " finished printing");
    }

    public static class Main {
        public static void main(String[] args) {

            synchronizedDemo printer = new synchronizedDemo();

            Thread t1 = new Thread(() -> {
                printer.printDocument("Thread-1");
            });

            Thread t2 = new Thread(() -> {
                printer.printDocument("Thread-2");
            });

            t1.start();
            t2.start();
        }
    }
}
