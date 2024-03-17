import java.util.Scanner;

    class Member {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        int ph_number;
        String address;
        int salary;
        Member(){
            System.out.print("Enter  name: ");
            name = sc.nextLine();
            System.out.print("Enter  age: ");
            age = sc.nextInt();
            System.out.print("Enter  phone number : ");
            ph_number = sc.nextInt();
            System.out.print("Enter  address : ");
            address = sc.next();
            System.out.print("Enter  Salary: ");
            salary = sc.nextInt();
        }
        public void printSalary(){
            System.out.println(salary);
        }
    }
    class Employee extends Member {
        Scanner sc = new Scanner(System.in);
        String specialization;
        String department;
        Employee(){
            System.out.print("Enter employee Speciaization : ");
            specialization = sc.next();
            System.out.print("Enter employee Department : ");
            department = sc.next();
        }
    }
    class Manager extends Member {
        Scanner sc = new Scanner(System.in);
        String specialization;
        String department;
        Manager(){
            System.out.print("Enter employee Speciaization : ");
            specialization = sc.next();
            System.out.print("Enter employee Department : ");
            department = sc.next();
        }
    }X

public class MemberDemo {
    public static void main(String[] args) {
        Member a1 = new Member();
        a1.printSalary();   
         Employee e1 = new Employee();
         e1.printSalary();
         Manager m1 = new Manager();
         m1.printSalary();
    }
}       X