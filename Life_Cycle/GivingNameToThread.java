package Life_Cycle;

public class GivingNameToThread extends Thread {
    public GivingNameToThread(String name){
       super(name);

    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        GivingNameToThread thread= new GivingNameToThread("jack ");

        thread.start();
       
        
    }
    
}
