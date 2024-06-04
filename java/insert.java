import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
    // JDBC URL, username, and password of the database
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // SQL query to insert data into the table
        String sql = "INSERT INTO mytable (id, name, age) VALUES (?, ?, ?)";

        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Creating a PreparedStatement to execute the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            // Setting values for the parameters in the SQL query
            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "value2");
            preparedStatement.setInt(3, 23);

            // Executing the SQL query to insert data into the table
            int rowsAffected = preparedStatement.executeUpdate();

            // Checking if data insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data into the table.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
