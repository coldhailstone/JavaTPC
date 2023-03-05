public class TPC05 {

    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);

        // 9개의 정수형 변수를 만들어라. -> 2차원 구조
        int[][] b = new int[3][3];
        b[0][0] = 1;
        b[0][1] = 2;
        b[0][2] = 3;

        b[1][0] = 1;
        b[1][1] = 2;
        b[1][2] = 3;

        b[2][0] = 1;
        b[2][1] = 2;
        b[2][2] = 3;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // 가변길이 배열
        char[][] star = new char[5][];
        for (int i = 0; i < star.length; i++) {
            star[i] = new char[i+1];
            for (int j = 0; j < star[i].length; j++) {
                star[i][j] = '*';
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}
