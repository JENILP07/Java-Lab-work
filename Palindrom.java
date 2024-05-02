import java.util.*;
public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int original = n;
		int reversed = 0;
		int remainder;
		
		while (n > 0) {
			remainder = n % 10;
			reversed = (reversed * 10) + remainder;
			n = n / 10;
		}
		
		if (original == reversed) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
		
		sc.close();
	}
}


