public class Lab4a {
    public static void main(String[] args){
   double a = Double.parseDouble(args[0]);
   double b = Double.parseDouble(args[1]);
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
