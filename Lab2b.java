//Write a program to create basic calculator by getting 2 numbers(using ommand line).
public class Lab2b {
  public static void main(String[] args){
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
   char c = args[2].charAt(0);
    if(c == '+') {
        System.out.println(a+b);
    }
    else if(c == '-') {
        System.out.println(a-b);
    }
    else if(c == '*') {
        System.out.println(a*b);
    }
    else{
        System.out.println(a/b);
    }
  }  
}
