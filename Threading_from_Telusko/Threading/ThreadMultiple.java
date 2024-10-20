package Threading_from_Telusko.Threading;
// threads are smallest unit of program or software.....
// when there are multitasking, exist os divides the software into multiple process or programs that are generally considered as threads.....
class First extends Thread
{
    public void run()  // compulsory but will be called with start method...
    {
        for(int i=0; i<100;i++){

            System.out.println("har har mahadev");
        }

    }
}
class Second extends Thread
{
    public void run(){
         for(int j=0; j<120;j++){

            
            System.out.println("jai shree ram");
        }

    }
}
public class ThreadMultiple {
    public static void main(String[] args) {
        First a = new First(); // creating object 1st time only...
        Second b =new Second();//creating object second time onwards....

        a.start();  // run method is compulsory to create to execute thread in java and call it with start();

        b.start();// thread is basically used to done work simultaneously...
    }
    
}
