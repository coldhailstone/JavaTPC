import kr.tpc.MemberVO;

public class TPC15 {

    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동", 50, "010-1111-1111", "서울");

        System.out.println(m.toString());
        System.out.println(m);
    }
}
