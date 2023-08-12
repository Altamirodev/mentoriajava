import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoDb {
    private static final String JDBC_URL = "jdbc:sqlserver://localhost:49501/mercadinho_db";
    private static final String USERNAME = "as";
    private static final String PASSWORD = "AdminDBA";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}