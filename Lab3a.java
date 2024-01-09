import java.util.Scanner;

public class Lab3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        int[] marks = new int[5];
         int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
             totalMarks += marks[i];
        }
       
        double percentage = (double) totalMarks / 5;

        
        String division;
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50) {
            division = "Second Division";
        } else if (percentage >= 40) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

       
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Division: " + division);

        scanner.close();
    }
}
