package Synchronization;

class MyThread extends Thread{

    private Counter counter;  //object of Counter class type
    public MyThread(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
class Counter {

   private int count=0;
    public void increment(){   //  and this part is also known as critical section to make whole block synchronized use ------> public synchronized void increment(){}  

        synchronized(this)
        {    // this is used to only one instance synchronized.........
            count++;

        }
      
        }
        public int getCount(){
            return count;
        }

}
public class SynchronizationEx {
    public static void main(String[] args) {
        Counter counter= new Counter();
        MyThread thread1= new MyThread(counter);
        MyThread thread2= new MyThread(counter);
        thread1.start();
        thread2.start();

        try{
            thread1.join();
        thread2.join();

        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(counter.getCount());
    }
    
}
