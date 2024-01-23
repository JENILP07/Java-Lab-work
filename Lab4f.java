public class Lab4f {
    public static void main(String[] args) {
        for (int i = 0; i <args.length; i++) {
            String s = args[i];
            char c = s.charAt(0);
            if (c>=65 && c<=90) {
                System.out.println(s);
            }
            else {
                return ;
            }
        }   
     }
}
