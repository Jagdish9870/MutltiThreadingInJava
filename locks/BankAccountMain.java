

//..............1st method.......................................... using synchronization.. and it is type of implicit locking...

// package locks;

// class BankAccountProcess  {
//     private int balance=250;

//     public synchronized void withdraw(int amount) {   // we can use here synchronized also...
//         System.out.println(Thread.currentThread().getName()+ " attempting to withdraw -> "+amount);

//         if(balance>=amount){
//             System.out.println(Thread.currentThread().getName()+ " proceeding with withdrawal of  -> "+amount);

//             try {
//                 Thread.sleep(3000);
//             } catch (InterruptedException e) {
            
//             };
//             // withdrawal successful..........................................................................................................
//             balance-=amount;
//             System.out.println(Thread.currentThread().getName()+ " withdrawal completed of -> "+amount +" and remaining balance is :"+balance);
//         }
//         else{
//             System.out.println(Thread.currentThread().getName()+ " insufficient balance to withdraw  ");
//         }
       
//     }
    
// }

// public class BankAccountMain{
//     public static void main(String[] args) {
//         BankAccountProcess hdfc =new BankAccountProcess();  
//         Runnable task= new Runnable() {
//             public void run(){
//                 hdfc.withdraw(250);


//             }
            
//         };
//         Thread t1= new Thread(task,"Thread 1");
//         Thread t2= new Thread(task,"Thread 2");
//         t1.start();
//         t2.start();



        
//     }

// }



//...2nd method..................................................... using locks.. and it is type of explicit locking.....................................................................

package locks;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class BankAccountProcess  {


    private int balance=250;
    private Lock lock = new ReentrantLock();

    public  void withdraw(int amount) {   // we can use here synchronized also...
        System.out.println(Thread.currentThread().getName()+ " attempting to withdraw -> "+amount);

        try{
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                   
                    try {
                        System.out.println(Thread.currentThread().getName()+ " proceeding with withdrawal of  -> "+amount);
        
                        Thread.sleep(3000);
                         // withdrawal successful..........................................................................................................
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+ " withdrawal completed of -> "+amount +" and remaining balance is :"+balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    
                    }finally{
                        lock.unlock();
                    }
                    
                   
                }
                
                else{
                    System.out.println(Thread.currentThread().getName()+ " insufficient balance to withdraw  ");
                }

            }
            else{
                System.out.println(Thread.currentThread().getName()+ "count not acquire the lock ,will try later");

            }

        }catch(Exception e){
            Thread.currentThread().interrupt();  // to notify if exception occur
            

        }

        
       
    }
    
}

public class BankAccountMain{
    public static void main(String[] args) {
        BankAccountProcess hdfc =new BankAccountProcess();  
        Runnable task= new Runnable() {
            public void run(){
                hdfc.withdraw(250);


            }
            
        };
        Thread t1= new Thread(task,"Thread 1");
        Thread t2= new Thread(task,"Thread 2");
        t1.start();
        t2.start();



        
    }

}


