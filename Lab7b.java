interface A{
    int a = 7;
    public void printHello();
}
interface A1 extends A{

}
interface A2 extends A{

}
interface A12 extends A1 , A2{

}
class B implements A12 {
    @Override
    public void printHello() {
        System.out.println("Hello World !");
    }
}
public class Lab7b {
    public static void main(String[] args) {
    B b = new B();
    b.printHello();
    }
}