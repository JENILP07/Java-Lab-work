// Write a program to calculate the area of circle.
import java.util.Scanner;
public class Lab2d {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius:");
        float r=scanner.nextFloat();
        double area=3.14*(r*r);
        System.out.println(area);
        scanner.close();
    }
    
}
