package kr.poly;

public class Cat extends Animal {
    // 이름, 나이, 종 : 상태정보

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }

    public void night() {
        System.out.println("밤에 눈에서 빛이 난다.");
    }
}
