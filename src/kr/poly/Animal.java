package kr.poly;

public abstract class Animal extends Object { // 추상클래스 (불완전한객체) -> Animal ani = new Animal(); X

    private String name;
    private int age;
    private String part;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public abstract void eat(); // 추상메서드 (불완전한메서드)

    public void move() { // 구현메서드
        System.out.println("무리를 지어 이동한다.");
    }
}
