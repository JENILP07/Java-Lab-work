// MultiThreading 2 Runnable
class MyThreadR1 implements Runnable{
    @Override
    public void run() {
    int i  = 0;
    while (i < 10){
        System.out.println("HI");
        i++;
      }
    }
}
class MyThreadR2 implements Runnable{
    @Override
    public void run() {
        int i  = 0;
        while (i < 10){
            System.out.println("Hello");
            i++;
        }
    }
}
public class H2 {
    public static void main(String[] args) {
        MyThreadR1 tr1 = new MyThreadR1();
        Thread t1 = new Thread(tr1);
        MyThreadR2 tr2 = new MyThreadR2();
        Thread t2 = new Thread(tr2);
        t1.start();
        t2.start();
    }
}
