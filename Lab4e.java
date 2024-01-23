import java.util.Scanner;
public class Lab4e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = str.length()/2 ; i < str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
