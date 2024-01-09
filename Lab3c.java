import java.util.Scanner;
public class Lab3c {
    public static void main(String[] args){
        int[] values = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value : ");
            values[i] = sc.nextInt();
        }
        if(values[0] == values[1] && values[1] == values[2]){
            System.out.println("All values are equal");
        }
        
        if (values[0] > values[1]) {
            if (values[0] > values[2]) {
                System.out.println("Value 1 is greatest");
            }
            else {
                System.out.println("Value 3 is greatest");
            }
        }
        if (values[1] > values[0]) {
            if (values[1] > values[2]) {
                System.out.println("Value 2 is greatest");
            }
            else {
                System.out.println("Value 3 is greatest");
            }
        }
        sc.close();
    }
}
