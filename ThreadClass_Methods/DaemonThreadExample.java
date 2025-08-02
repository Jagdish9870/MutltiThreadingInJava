package ThreadClass_Methods;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("Main thread finished.");
        t.setDaemon(true);  // Set the thread as daemon before starting
        t.start();

        // JVM will exit as soon as main() ends, daemon thread will be killed.
    }
}
