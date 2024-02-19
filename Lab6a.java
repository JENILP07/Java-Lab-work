import java.util.Scanner;
class Student1{
    Scanner sc = new Scanner(System.in);
    int id_no = 0;
    int no_of_subjects = 5;
    int subject_code = 0;
    int[] subject_credit = new int[5];
    char[] grade = new char[5];
    int spi = 0;
    int totalCredit = 0;
    Student1(){
        System.out.println("Enter id :");
        this.id_no = sc.nextInt();
        System.out.println("Enter Subject code :");
        this.subject_code = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter credit and grade of subject :" + (i+1) );
            subject_credit[i] = sc.nextInt();
            grade[i] = sc.next().charAt(i);
            totalCredit += subject_credit[i];
        }
    }
    void calcSpi() {
        int totalMarks = 0;
        for ( int i = 0; i < 5 ; i++ ) {
            if (grade[i] == 'A') {
                totalMarks += 10;
            }
            else if (grade[i] == 'B') {
                totalMarks += 7;
            }
            else if (grade[i] == 'C') {
                totalMarks += 4;
            }
            else if (grade[i] == 'D') {
                totalMarks += 2;
            }
        }
        spi = totalMarks / totalCredit;
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
            System.out.println("Spi of student " + (i+1) + " = " + students[i].spi);
        }
    }
}
