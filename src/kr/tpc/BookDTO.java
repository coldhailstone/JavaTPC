package kr.tpc;

public class BookDTO {

    private String title;
    private int price;
    private String company;
    private int page;

    // 디폴트 생성자 메서드 (생략)
    public BookDTO() {
        // 객체를 생성하는 작업한다. (기계어)
        super();
    }

    public BookDTO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }

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

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", page=" + page +
                '}';
    }
}
