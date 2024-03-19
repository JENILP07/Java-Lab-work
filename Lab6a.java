import java.util.Scanner;

class Student1 {
    Scanner sc = new Scanner(System.in);
    int id_no = 0;
    int no_of_subjects = 5;
    int[] subject_code = new int[5];
    int[] subject_credit = new int[5];
    String[] grade = new String[5];
    double spi = 0;
    int totalCredit = 0;

    Student1() {
        System.out.println("Enter id :");
        this.id_no = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Subject code, credit and grade of subject " + (i + 1) + ": ");
            subject_code[i] = sc.nextInt();
            subject_credit[i] = sc.nextInt();
            grade[i] = sc.next();
            totalCredit += subject_credit[i];
        }
    }

    void calcSpi() {
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            if (grade[i].equals("A")) {
                totalMarks += 10;
            } else if (grade[i].equals("B")) {
                totalMarks += 7;
            } else if (grade[i].equals("C")) {
                totalMarks += 4;
            } else if (grade[i].equals("D")) {
                totalMarks += 2;
            }
        }
        System.out.println(totalMarks);
        spi = (double) totalMarks / totalCredit; // Cast one of the operands to double
    }
}

public class Lab6a {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Student1[] students = new Student1[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student1();
        }
        for (int i = 0; i < n; i++) {
            students[i].calcSpi();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Spi of student " + (i + 1) + " = " + students[i].spi);
        }
    }
}
