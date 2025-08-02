package Threading_from_Telusko.Threading;
class First extends Thread
{
    public void run(){
        for(int i=0; i<=10;i++){

            System.out.println("har har mahadev");
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }

    }
}
class Second extends Thread
{
    public void run(){
         for(int j=0; j<=10;j++){

            
            System.out.println("jai shree ram");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }

    }
}
public class ThreadPriorityAndSleep {
    public static void main(String[] args) throws InterruptedException {
        First a = new First(); 
        Second b =new Second();
        System.out.println(a.getPriority());
       // b.setPriority(Thread.MAX_PRIORITY);   // basically priority goes 1-10 , (min -high)


        a.start();  
        
        b.start();
        a.join();
        b.join();
        

    }
    
}
