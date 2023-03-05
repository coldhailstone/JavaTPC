package kr.bit;

// 책(객체) -> 제목, 가격, 출판사, 페이지 수......(상태 정보) + (행위 정보: 동작 = 메서드)
public class Book {

    private String title;
    private int price;
    private String company;
    private int page;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
