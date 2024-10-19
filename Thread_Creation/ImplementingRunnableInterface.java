package Thread_Creation;


class SecondWay implements Runnable{
    public void run() {
        System.out.println("this is inside of thread: " +Thread.currentThread().getName());

    }
}

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        
        SecondWay SMethod= new SecondWay();

        // when we implement runnable class we have to  make a thread class object to start thread...............
        Thread t1= new Thread(SMethod);      
        t1.start();  

        System.out.println("thread name : "+Thread.currentThread().getName());
    }
    
}
