import java.io.*;
public class Lab10B {
    public static void main(String[] args) {
        String Word1 = "Jenil";
        String Word2 = "$";

        try {
            File f1 = new File("abc.txt");
            File f2 = new File("xyz.txt");
            BufferedReader R1 = new BufferedReader(new FileReader(f1));
            BufferedWriter W1 = new BufferedWriter(new FileWriter(f2));

            String s = R1.readLine();
            int c = 0;

            while (s != null){
                String ChangeLine = "";
                String[] a = s.split(" ");
                for (int i = 0; i < a.length; i++) {
                    if(a[i].equals(Word1)){
                        c++;
                        ChangeLine += Word2 + " ";
                    }else {
                        ChangeLine += a[i] + " ";
                    }
                }
                W1.write(ChangeLine);
                W1.newLine();
                s = R1.readLine();
            }

            R1.close();
            W1.close();
            System.out.println("Replacement Count = " + c );

        }catch (Exception e){
            System.out.println(e);
        }
    }
}