import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // Dog.class, Cat.class
        Animal ani = new Dog(); //upcasting
        ani.eat();

        Animal ani1 = new Cat();
        ani1.eat();
        ((Cat)ani1).night(); // downcasting
    }
}
