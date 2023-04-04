import kr.tpc.DBConnector;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {

    public static void main(String[] args) {
        // Oracle, MySQL -> Driver class
        DBConnector connector = new JavaOracle();
        connector.getConnection("url", "id", "password");

        DBConnector connector2 = new JavaMySQL();
        connector2.getConnection("url2", "id", "password");
    }
}
