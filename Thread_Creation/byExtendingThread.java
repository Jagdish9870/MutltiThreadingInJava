package Thread_Creation;

class firsMethod extends Thread {
    public void run(){
        System.out.println("this is inside thread: " +Thread.currentThread().getName());
    }
    
}
public class byExtendingThread{
    public static void main(String[] args) {

        firsMethod fMethod= new firsMethod();    // new state
        fMethod.start();  //runnable state

        System.out.println("thread name : P"+Thread.currentThread().getName());
        
    }
}