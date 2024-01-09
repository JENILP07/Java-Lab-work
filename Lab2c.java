//Write a program to create basic calculator by getting 2 numbers
import java.util.Scanner;
public class Lab2c {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of A:"); 
    float a = sc.nextFloat();
    System.out.println("Enter value of B:"); 
    float b = sc.nextFloat();
    sc.nextLine();
    char c=sc.nextLine().charAt(0);
    System.out.println(c);
    if(c == '+') {
        System.out.println(a+b);
    }
    else if(c == '-') {
        System.out.println(a-b);
    }
    else if(c == '*') {
        System.out.println(a*b);
    }
    else{
        System.out.println(a/b);
    }
    
     sc.close();
  }  
}
