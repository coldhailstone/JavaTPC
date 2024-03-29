public class TPC39 {

    public static void main(String[] args) {
        int a = 1;
        Integer b = 1; // Boxing
        System.out.println(b.intValue()); // 1
        System.out.println(b.toString()); // "1"

        Object[] obj = new Object[3];
        // 1, 2, 3
        obj[0] = 1;
        obj[1] = 2;
        obj[2] = 3;
        System.out.println(obj[0].toString());
        System.out.println(obj[1].toString());
        System.out.println(obj[2].toString());

        // "100" + "100" = 200
        String x = "100";
        String y = "100";
//        System.out.println(x + y); // 100100
        System.out.println(Integer.parseInt(x) + Integer.parseInt(y)); // 200
    }
}
