public class TPC09 {

    public static void main(String[] args) {
        int a = 56;
        int b = 40;

        TPC09 tpc = new TPC09(); // heap Area (힙)
        int sum = tpc.sum(a, b);
        System.out.println(sum);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
