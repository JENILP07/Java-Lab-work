//Write a program to convert temperature from Fahrenheit to Celsius
import java.util.Scanner;
public class Lab2e {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit:");
        double f=sc.nextDouble();
        double c=(f-32*5)/9;
        System.out.println(c);
        sc.close();
    }
    
}
