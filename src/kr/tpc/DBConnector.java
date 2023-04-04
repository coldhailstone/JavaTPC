package kr.tpc;

public interface DBConnector {

    public void getConnection(String url, String id, String password);
}
