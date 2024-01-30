import java.util.Scanner;

class Time {
    int hour ,  minute , second;
    public int calcTime() {
       
    }
    p
}

public class Lab5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        System.out.println("Enter Timr 1 : ");
        t1.hour= sc.nextInt();
        t1.minute= sc.nextInt();
        t1.second= sc.nextInt();
        System.out.println("Enter Timr 2 : ");
        t2.hour= sc.nextInt();
        t2.minute= sc.nextInt();
        t2.second= sc.nextInt();
       
        sc.close();
    }
}
