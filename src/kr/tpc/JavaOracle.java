package kr.tpc;

public class JavaOracle implements DBConnector {

    @Override
    public void getConnection(String url, String id, String password) {
        System.out.println("Oracle DB가 접속됩니다.");
    }
}
