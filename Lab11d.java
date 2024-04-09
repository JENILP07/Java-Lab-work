import java.io.*;
/*class Student2{
	String name;
	int age;
	Student2(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name + " " + age;
	}
}*/
public class Lab11d {
	public static void main ( String[] args ) {
		String fileName = "abc.txt";
		try {
			DataOutputStream d = new DataOutputStream (new FileOutputStream (fileName));
			d.writeUTF ("Jenil");
			d.writeInt (29);
			d.writeUTF ("maan");
			d.writeInt (30);
			d.writeUTF ("X");
			d.writeInt (31);
			System.out.println ("Data Written Successfully");
			d.close ();
		}catch (Exception e){
			//	e.printStackTrace ();
		}
		try {
			DataInputStream f = new DataInputStream (new FileInputStream (fileName));
			while ( f.available () > 0 ){
				String name = f.readUTF ();
				int age = f.readInt ();
				STudent stu = new STudent (name,age);
				System.out.println (stu);
			}
		}catch ( Exception e ){
			//e.printStackTrace ();
		}
	}
}

