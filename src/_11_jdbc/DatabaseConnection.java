package _11_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements AutoCloseable {

    private final String CONNECTION_URL = "jdbc:mysql://localhost:3306/test_jdbc?serverTimezone=Europe%2FIstanbul";
    private final String username  ="root";
    private final String password = "root";
    protected Connection connection = null;

    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, username, password);
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        finally {
            System.out.println("Connection established");
        }
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
