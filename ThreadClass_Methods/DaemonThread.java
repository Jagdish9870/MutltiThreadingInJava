package ThreadClass_Methods;



public class DaemonThread extends Thread {
    public DaemonThread(String name){
        super(name);
    }

    public void run(){
       while(true){
            System.out.println(Thread.currentThread().getName());

           
        }
    }
    public static void main(String[] args) throws InterruptedException {
        DaemonThread in= new DaemonThread("harsh");
            in.setDaemon(true);
        in.start();
        System.out.println("main done");
        
     


    }
    
}