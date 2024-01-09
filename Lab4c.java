import java.util.*;
public class Lab4c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] a=new double[4];
        double avrage = 0;
        for (int i = 0; i < a.length; i++){
            a[i]=scanner.nextDouble();
            avrage += a[i];
        }   
        avrage/=4;
        System.out.println(avrage);
        scanner.close();
    }
}
