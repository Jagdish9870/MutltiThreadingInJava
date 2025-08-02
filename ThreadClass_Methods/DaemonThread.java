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
        DaemonThread dthread= new DaemonThread("harsh");
            dthread.setDaemon(true);
        dthread.start();
        System.out.println("main done");
        
     


    }
    
}