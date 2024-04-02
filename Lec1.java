import java.util.Scanner;
import java.util.Date;
public class Lec1 {
    public static void main(String[] args) {
     Date dStart = new Date();

        long ans=0;

        for (long i=0;i<=10000000000L;i++){
            ans = ans + i;
        }
        Date dEnd = new Date();
        System.out.println(ans);
        System.out.println(dEnd.getTime()-dStart.getTime());

    }
}
