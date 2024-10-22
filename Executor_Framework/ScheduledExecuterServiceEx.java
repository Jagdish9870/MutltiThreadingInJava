package Executor_Framework;
import java.util.concurrent.*;
public class ScheduledExecuterServiceEx {
    public static void main(String[] args) {


        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

       

        // Schedule a task to run every 2 seconds, starting after an initial delay of 1 second
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task running after 2 second : " + System.currentTimeMillis());
        },2,5, TimeUnit.SECONDS);

        scheduler.schedule(()->{
            System.out.println("initiating after shutdown");
            
            scheduler.shutdown();

        }, 20, TimeUnit.SECONDS);
       
    }
    
}
