import java.util.Scanner;
class Circle {
     double radius;
      public double circleArea() {
        return 3.14*this.radius*this.radius;
      }  
}

public class Lab5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3];

        for(int i = 0; i < 3; i++) {
        System.out.print("Enter Circle Radius " + (i+1) + " : ");
        double radius = sc.nextDouble();
        c[i] = new Circle();
        c[i].radius = radius;
        double area = c[i].circleArea();
        System.out.println(area);
        }
        sc.close();
    }
}