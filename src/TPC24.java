import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {

    public static void main(String[] args) {
        // 2. 다형성 배열
        // Dog, Cat 저장할 배열을 생성하시오.
        Animal[] ani = new Animal[2];
        ani[0] = new Dog();
        ani[1] = new Cat();

        for (Animal r : ani) {
            r.eat();
            if (r instanceof Cat) {
                ((Cat)r).night(); // downcasting
            }
        }
    }
}
