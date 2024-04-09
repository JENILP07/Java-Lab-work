import java.io.*;
public class Lab11b {
	public static void main ( String[] args ) {
	String path = args[ 0 ];
	File f_d = new File (path);
	if ( f_d.isFile () ){
		System.out.println ("File Size : " + f_d.length () + " bytes");
	  } else if ( f_d.isDirectory () ) {
		System.out.println ("Listing Files in directory : " + f_d.getAbsoluteFile ());
		File f[] = f_d.listFiles ();
		if ( f != null ) {
			for ( File file:f ){
				if ( file.isFile () ){
					System.out.println (file.getName ());
				}
			}
		}
	  }
	}
}
