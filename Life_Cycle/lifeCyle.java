package Life_Cycle;

public class lifeCyle extends Thread {
    public void run(){
        System.out.println("running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws InterruptedException {
        lifeCyle lc= new lifeCyle();
        System.out.println(lc.getState());
        lc.start();
        System.out.println(lc.getState());
        Thread.sleep(100);
        System.out.println(lc.getState());
            lc.join();
            System.out.println(lc.getState());

        
    }
    
}
