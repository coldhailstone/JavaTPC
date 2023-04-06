//import java.lang.*;

public class TPC34 {

    public static void main(String[] args) {
        // String
        java.lang.String str = new java.lang.String("APPLE");
        String v = str.toLowerCase();
        System.out.println(v); // apple
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf("PL"));
        System.out.println(str.indexOf("PX"));
        System.out.println(str.replaceAll("P", "X"));
    }
}
