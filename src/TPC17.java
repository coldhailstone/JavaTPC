import kr.tpc.MovieVO;

public class TPC17 {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = { 10, 20, 30, 40, 50 };

        int[] c = new int[] { 10, 20, 30, 40, 50 };

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // 영화 (제목, 가격, 주인공, 등급, 시간)
        MovieVO mv = new MovieVO("스즈메의 문단속", 11000, "스즈메", 12, 2.1f);
        System.out.println(mv);

        // 영화 3편을 저장
        MovieVO[] marr = new MovieVO[3];
        marr[0] = new MovieVO("초속 5cm", 12000, "켄지", 12, 1.9f);
        marr[1] = new MovieVO("너의 이름은", 13000, "타키", 12, 2.0f);
        marr[2] = new MovieVO("날씨의 아이", 14000, "류노스케", 12, 1.8f);

        System.out.println(marr[0]);
        System.out.println(marr[1]);
        System.out.println(marr[2]);

        System.out.println("------------------");

        for (MovieVO m : marr) {
            System.out.println(m);
        }
    }
}
