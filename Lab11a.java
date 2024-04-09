import java.io.*;
public class Lab11a {
	public static void main ( String[] args ) {
		String fileName = "abc.txt";
		try {
			BufferedWriter bw = new BufferedWriter (new FileWriter (fileName));
			bw.write ("Jenil,29\n");
			bw.write ("Jeni,30\n");
			bw.write ("Jen,31\n");
			bw.close ();
			System.out.println ("Data Written Sucessfully");
		}catch (Exception e){
			e.printStackTrace ();
		}
		try {
			BufferedReader br = new BufferedReader (new FileReader (fileName));
			String line;
			while ( (line = br.readLine ()) != null ){
				String nameAge[] = line.split (",");
				String name = nameAge[0];
				int age = Integer.parseInt (nameAge[1]);
				STudent st = new STudent (name, age);
				System.out.println (st);
			}
		}catch ( Exception e ){
			e.printStackTrace ();
		}
	}
}
class STudent{
	String name;
	int age;
	STudent(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println (name);
		System.out.println (age);
	}
}
