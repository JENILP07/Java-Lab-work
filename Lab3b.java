import java.util.*;
public class Lab3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int temp = n;
        int reverse =0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            reverse = reverse*10 + lastdigit;
            n/=10;
        }
        if (temp == reverse) {
            System.out.println("Number is pallindrome");
        }
        else {
            System.out.println("Number is not pallindrome");
        }
        sc.close();
    }
}
