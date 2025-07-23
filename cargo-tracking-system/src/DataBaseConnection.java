import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {


    private static final String URL = "jdbc:postgresql://localhost:5432/cargo_tracking_db";

    private static final String USER = "ekaya";
    //
    private static final String PASSWORD = "2070Badem.";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

