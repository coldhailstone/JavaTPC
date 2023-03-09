import kr.tpc.BookVO;

public class TPC12 {

    public static void main(String[] args) {
        // 생성자 -> 생성 + 초기화 -> 중복정의
        BookVO b = new BookVO();
        System.out.print(b.title + "\t");
        System.out.print(b.price + "\t");
        System.out.print(b.company + "\t");
        System.out.println(b.page);

        BookVO b1 = new BookVO("오라클", 17000, "에이스", 610);
        System.out.print(b1.title + "\t");
        System.out.print(b1.price + "\t");
        System.out.print(b1.company + "\t");
        System.out.println(b1.page);
    }
}
