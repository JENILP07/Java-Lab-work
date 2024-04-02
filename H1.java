//MultiThreading 1
class MyThread1 extends  Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("Hi");
            System.out.println("Thread 1");
            i++;
        }
    }
}
class MyThread2 extends  Thread{
    @Override
    public void run(){
        int i =0;
        while (i<10){
            System.out.println("Hello");
            System.out.println("Thread 2");
            i++;
        }
    }
}
public class H1 {
    public static void main(String[] args) {
     MyThread1 t1 = new MyThread1();
     MyThread2 t2 = new MyThread2();
     t1.start();
     t2.start();
    }
}
