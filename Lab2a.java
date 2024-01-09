//Write a program to get 2 numbers from the user and print the sum of two numbers
import java.util.*;
public class Lab2a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
            System.out.print("Enter value a: ");
            int a = sc.nextInt();
            System.out.print("Enter value b: ");
            int b = sc.nextInt();
            System.out.print("sum = ");
            System.out.print(a+b);
        sc.close(); //

    }
}
