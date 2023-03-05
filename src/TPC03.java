import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

    public static void main(String[] args) {
        // 관계를 이해하라. PDT(원시 자료형) vs UDDT(사용자 정의 자료형)
        // 정수 1개를 저장하기 위한 변수를 선언하시오.
        int a;
        a = 10;

        // 책 1권을 저장하기 위한 변수를 선언하시오.
        Book b;
        b = new Book();
        b.setTitle("자바");
        b.setPrice(15000);
        b.setCompany("한빛미디어");
        b.setPage(700);

        System.out.println(b.getTitle());
        System.out.println(b.getPrice());
        System.out.println(b.getCompany());
        System.out.println(b.getPage());

        PersonVO p;
        p = new PersonVO();
        p.setName("박찬우");
        p.setAge(31);
        p.setHeight(172.1f);
        p.setWeight(83.5f);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());
        System.out.println(p.getWeight());
    }
}
