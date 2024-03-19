interface Transport {
    void deliver();
}
abstract class Animal {

}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
    @Override
    public void deliver() {
        System.out.println("Camel");
    }
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
    @Override
    public void deliver() {
        System.out.println("Donkey");
    }
}
public class Lab7c {
    public static void main(String[] args) {
    Animal[] arr = {
       new Tiger(),
        new Camel(),
        new Deer(),
        new Donkey()
      };
    for(Animal a : arr){
        if(a instanceof Transport){
            ((Transport) a).deliver();
        }
      }
    }
}
