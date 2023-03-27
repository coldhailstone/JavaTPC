import kr.tpc.Animal;
import kr.tpc.Dog;
import kr.tpc.Cat;

public class TPC19 {

    public static void main(String[] args) {
        // Dog, Cat --> Animal
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

        // Dog.java(X), Dog.class(O)

        // Animal <--- [Dog.class, Cat.class]
        Animal d = new Dog();
        d.eat();

        Animal c = new Cat();
        c.eat();
    }
}
