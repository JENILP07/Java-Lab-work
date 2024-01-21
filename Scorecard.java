import java.util.Scanner;
public class Scorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int score1 = 0;
      int score2 = 0;
      int[][][] runsPerOver = new int[2][3][6];
      for(int k = 0; k < 2 ; k++){
        System.out.println("innings = " + (k+1));
        for (int i = 0; i < 3  ; i++) {
            System.out.println("Over = " + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter Runs of ball " + (j+1) + ": ");
                runsPerOver[k][i][j] = sc.nextInt();
              
            }
            System.out.println();
      }
      System.out.println();
    }
    for(int k = 0; k < 2 ; k++){
       
        for (int i = 0; i < 3; i++) {
           
            for (int j = 0; j < 6; j++) {
                if( k == 0 ) {
                    score1 += runsPerOver[k][i][j];
                    }
                    else {
                       score2 +=runsPerOver[k][i][j];
                    }    
            }
           
      }
     
    }

    double avarage1 = score1 / (double)runsPerOver.length;
    double avarage2 = score2 / (double)runsPerOver.length;
      System.out.println("Score of 1 innings : " + score1);
      System.out.println("Score of 2 innings : " + score2);
      System.out.println(avarage1);
      System.out.println(avarage2);
      sc.close();
    }
}
