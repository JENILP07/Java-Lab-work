import java.util.Scanner;
class myExeption extends Exception{
	public myExeption(String message){
		System.out.println (" negative value exception");
	}
}

public class Exeption1 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt ();
		if ( n < 0) {
			try {
				int a= 1/0;
			} catch ( Exception e ) {
				System.out.println ("Error : " + e.getMessage ());
			}
		}
	}
}
