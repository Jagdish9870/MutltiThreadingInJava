package ThreadClass_Methods;

public class MyThread extends Thread {
    public void run()
    {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);  // second method
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }

            System.out.println("running");
            
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread mt= new MyThread();
        mt.start();  // first method
        mt.join();  // third method..  can use join to print message after a specific time..............
        System.out.println("hii");
    
    }
    
}
