import java.util.*;
class Student {
   static int count = 0 ;
   Student(){

       count++;

   } 
}

public class Lab5f {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of students");
     int n = sc.nextInt();
     Student[] s = new Student[n];
     for (int i = 0; i < n; i++){
        s[i] = new Student();
     }   
     System.out.println(Student.count);
     sc.close();
    }
}