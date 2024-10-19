package ThreadClass_Methods;

public class InterruptMethod extends Thread {
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("running");
        } catch (InterruptedException e) {
           
           System.out.println(" exception "+e);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        InterruptMethod in= new InterruptMethod();
        in.start();
        in.interrupt();


    }
    
}
