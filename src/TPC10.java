import kr.tpc.BookDTO;

public class TPC10 {

    public static void main(String[] args) {
        int a;
        a = 10;

        // 책(BookDTO)이라는 자료형을 만들자. --> class
        // 객체 생성
        BookDTO b;
        b = new BookDTO();
        b.setTitle("자바");
        b.setPrice(17000);
        b.setCompany("영진");
        b.setPage(670);

        System.out.print(b.getTitle() + "\t");
        System.out.print(b.getPrice() + "\t");
        System.out.print(b.getCompany() + "\t");
        System.out.print(b.getPage() + "\t");
    }
}
