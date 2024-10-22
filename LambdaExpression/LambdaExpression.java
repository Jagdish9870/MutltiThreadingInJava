package LambdaExpression;



//thread safety means there will be no race condition or will be no unexpected result
public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable= ()-> { System.out.println("example of lambda exp"); };   // lambda expression using anonymous class


     Thread thread= new Thread(runnable);
        thread.start();


        // or you can do this........................................ 
        Thread thread2= new Thread(() ->System.out.println("example 2 of lambda exp"));
        thread2.start();

        // if there are multiple lines......................
        Thread thread3= new Thread(() ->{
            System.out.println("example 3 of lambda exp");
            System.out.println("here are multiple lines");
        });
        thread3.start();


    }
    
}
