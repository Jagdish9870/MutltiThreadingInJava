package CompletableFuture;
import java.util.concurrent.*;
public class CompletableFutureEx2 {
    public static void main(String[] args) {
        CompletableFuture<String> f1= CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            System.out.println("worker");

            } catch (Exception e) {
                
            }
            return "ok";

        });

        CompletableFuture<String> f2= CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            System.out.println("worker");

            } catch (Exception e) {
                
            }
            return "ok";

        });


        CompletableFuture<Void> f= CompletableFuture.allOf(f1,f2);
        f.join();
        System.out.println("main");
    }
    
}
