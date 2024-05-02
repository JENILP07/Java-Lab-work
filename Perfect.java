import java.util.Scanner;
public class Perfect {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter a Number : ");
		int n = sc.nextInt ();
		int temp = 0;
		for ( int i = 1; i <= n-1; i++ ) {
			if(n%i == 0){
				temp+=i;
			}
		}
		if ( temp == n  ){
			System.out.println ("Is Perfect");
		}
		else {
			System.out.println ("Not Perfect");
		}
	}
}
