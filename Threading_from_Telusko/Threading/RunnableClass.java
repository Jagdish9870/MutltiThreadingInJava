package Threading_from_Telusko.Threading;
class T implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
class U implements Runnable{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }

    }

}

public class RunnableClass {
    public static void main(String[] args) {
        T r= new T(); 
        Runnable r1= new U();

        Thread t1= new Thread(r);
        Thread t2= new Thread(r1);
        t1.start();
        t2.start();
    }
    
}
