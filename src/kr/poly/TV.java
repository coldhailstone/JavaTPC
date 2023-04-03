package kr.poly;

public class TV implements RemoCon {

    int currCH = 70;

    @Override
    public void chUp() {
        if (currCH < MAXCH) {
            currCH++;
        } else {
            currCH = 1;
        }
        System.out.println("TV의 채널이 올라간다.: " + currCH);
    }

    @Override
    public void chDown() {
        if (currCH > MINCH) {
            currCH--;
        } else {
            currCH = 100;
        }
        System.out.println("TV의 채널이 내려간다.: " + currCH);
    }

    @Override
    public void internet() {
        System.out.println("인터넷이 된다.");
    }
}
