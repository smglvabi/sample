import java.sql.*;
public class DBManager {
    private static final String URL =
            "jdbc:postgresql://localhost:5432/oop";
    private static final String USER = "postgres";
    private static final String PASSWORD = "2050";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
