import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {

    public static void main(String[] args) {
        // A, B 클래스를 저장할 배열
        Object[] o = new Object[2]; // 다형성배열
        o[0] = new A();
        o[1] = new B();

        printGo(o);
    }

    private static void printGo(Object[] o) {
        for (Object a : o) {
            if (a instanceof A) {
                ((A)a).go();
            } else {
                ((B)a).go();
            }
        }
    }
}
