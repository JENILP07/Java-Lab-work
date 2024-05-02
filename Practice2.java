class GrandFather{
	GrandFather(){
		System.out.println ("Hi");
	}
}
class Father extends GrandFather{
	Father(){
		super();
		System.out.println ("Hello");
	}
}
class Child extends Father{
	Child(){
		super();
		System.out.println ("Hey");
	}
}
public class Practice2 {
	public static void main ( String[] args ) {
		Child childObj = new Child ();
	}
}
