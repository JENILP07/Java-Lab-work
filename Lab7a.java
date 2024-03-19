abstract class Vegetable{
    public String color;
    public Vegetable(String color){
        this.color = color;
    }
    public String toString(){
        return color;
    }
}
class Potato extends Vegetable{
    public Potato(String color){
    super(color);
    }
}
class Brinjal extends Vegetable{
    public Brinjal(String color){
        super(color);
    }
}
class Tomato extends Vegetable{
    public Tomato(String color){
        super(color);
    }
}
public class Lab7a {
    public static void main(String[] args) {
        Potato p = new Potato("Brown");
        System.out.println(p);
        Brinjal b = new Brinjal("purple");
        System.out.println(b);
        Tomato t= new Tomato("Red");
        System.out.println(t);
    }
}
