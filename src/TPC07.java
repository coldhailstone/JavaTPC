public class TPC07 {

    public static void main(String[] args) {
        int a = 20;
        float b = 56.7f;
        float result = sum(a, b); // Call By Value (값)
        System.out.println(result); // 76.7

        int[] arr = {
                1,
                2,
                3,
                4,
                5
        };
        int vv = arrSum(arr); // Call By Reference (주소)
        System.out.println(vv); // 15
    }

    public static float sum(int a, float b) {
        return a + b;
    }

    public static int arrSum(int[] arr) {
        int hap = 0;
        for (int value : arr) {
            hap += value;
        }
        return hap;
    }
}
