package kr.tpc;

public class JavaMySQL implements DBConnector {

    @Override
    public void getConnection(String url, String id, String password) {
        System.out.println("MySQL DB가 접속됩니다.");
    }
}
