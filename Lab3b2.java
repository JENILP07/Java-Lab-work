import java.util.*;
public class Lab3b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int start = 0;
        int end = n.length()-1; 
        int count =0;
       while (start <= end) {
        if (n.charAt(start) != n.charAt(end)) {
            count++;
            break;
        }
        start++;
        end--;
       }
       if(count==0) {
        System.out.println("Pallindrome");
       }
       else {
        System.out.println("Not Palindrome");
       }
        sc.close();
    }
}
