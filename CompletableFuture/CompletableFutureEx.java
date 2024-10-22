package CompletableFuture;
import java.util.concurrent.*;
public class CompletableFutureEx {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            System.out.println("worker");

            } catch (Exception e) {
                
            }
            return "ok";

        });
        String s=null;
        try {
            s=completableFuture.get();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        } catch (ExecutionException e) {
           
            e.printStackTrace();
        }
        // s=completableFuture.getNow("jack");
        System.out.println(s);
        System.out.println("main");


    }
    
}
