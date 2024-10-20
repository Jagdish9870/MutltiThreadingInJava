package Threading_from_Telusko.Threading;
class Counter{
    int count=0;
    public synchronized void increament(){   // increment ensure that this method will be called by one keyword at a time....
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c= new Counter();
        Runnable r= ()->{                            // this is known as lambda expression......
            for(int i=0;i<100;i++){
               c.increament();
                
            }
    };
    Runnable r1=()->{                                // this is known as lambda expression.........
             for(int j=0;j<100;j++){
            c.increament();
            
        }

        };
        
        Thread t1= new Thread(r);
        Thread t2= new Thread(r1);
        t1.start();
        t2.start();
        t1.join();  // join() method allow main thread to wait for other thread to join....
        t2.join();
        System.out.println(c.count);


    }
    
}
