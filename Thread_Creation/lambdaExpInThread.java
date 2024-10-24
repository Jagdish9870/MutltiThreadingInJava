package Thread_Creation;

public class lambdaExpInThread{
    public static void main(String[] args) {
Runnable r= ()->{
    for(int i=0;i<5;i++){
        System.out.println(i);
    }
};
Thread thread= new Thread(r);
thread.start();

    }
}