package ThreadClass_Methods;

public class setPriorityMethod extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ " priority : " + Thread.currentThread().getPriority() +"  count " +i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args) {
        setPriorityMethod stm= new setPriorityMethod();
        setPriorityMethod stm2= new setPriorityMethod();
        setPriorityMethod stm3= new setPriorityMethod();
        stm.setPriority(Thread.MAX_PRIORITY);
        stm2.setPriority(Thread.MIN_PRIORITY);
        stm3.setPriority(Thread.NORM_PRIORITY);

        stm.start();
        stm2.start();
        stm3.start();

        
    }
    
}
