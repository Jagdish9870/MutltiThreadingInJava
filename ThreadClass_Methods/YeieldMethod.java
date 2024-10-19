package ThreadClass_Methods;


public class YeieldMethod extends Thread {
    public YeieldMethod(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());

            Thread.yield();  // to give chance to other threads...
        }
    }
    public static void main(String[] args) throws InterruptedException {
        YeieldMethod in= new YeieldMethod("harsh");
        YeieldMethod in2= new YeieldMethod("monit");
        in.start();
        in2.start();
     


    }
    
}