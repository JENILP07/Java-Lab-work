import java.util.*;
public class Lab4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int vowel =0 ,consonant = 0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == 'a' || n.charAt(i) ==  'e'||n.charAt(i) ==  'i'||n.charAt(i) == 'o'||n.charAt(i) == 'u'||n.charAt(i) == 'A'||n.charAt(i) == 'E'||n.charAt(i) == 'I'||n.charAt(i) == 'O'||n.charAt(i) == 'U'){
                vowel++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("No of Vowels ="+vowel);
        System.out.println("No of Consonants ="+consonant);
        scanner.close();
    }
}
