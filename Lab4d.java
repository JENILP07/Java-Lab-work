import java.util.Scanner;
public class Lab4d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter array Element: ");
            array[i] = sc.nextInt();
        }
        for (int i = size-1; i!=-1; i--) {
            System.out.print( array[i]);
        }
        sc.close();
    }
}
