package json_practice.handson_practice;

import java.sql.*;

public class CreateDatabase {
    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(
                "jdbc:h2:file:./data/mydb",
                "sa",
                ""
        );

        Statement stmt = conn.createStatement();

        stmt.execute("""
            CREATE TABLE IF NOT EXISTS users (
                id INT PRIMARY KEY,
                name VARCHAR(50),
                email VARCHAR(100)
            )
        """);

        stmt.execute("""
            INSERT INTO users VALUES
            (1, 'Riddhi', 'riddhi@gmail.com'),
            (2, 'Aman', 'aman@gmail.com')
        """);

        System.out.println("Database & table created ✅");

        conn.close();
    }
}
