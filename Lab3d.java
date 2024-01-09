import java.util.Scanner;
public class Lab3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value :");
            int n = sc.nextInt();
            int temp = 0;
          
            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    temp++;
                }
            }
            if(temp == 0) {
                System.out.println("Number is Zero");
                }
            else if(temp == 2){ 
                System.out.println("Number is Prime ");
            }
            else{
                System.out.println("Number is Not Prime");
            }
            sc.close();
    }
}
