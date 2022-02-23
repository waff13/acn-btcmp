package Day06;

import java.sql.*;

public class Task03 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String pathToDB = "chinook.db";

        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + pathToDB);

        Statement statement = connection.createStatement();

        statement.execute("SELECT DISTINCT City, Country \n" +
                "FROM customers\n" +
                "WHERE City like '%n%'\n" +
                "LIMIT 10\n" +
                "OFFSET 15");

        ResultSet resultSet = statement.getResultSet();

        while(resultSet.next()){

            System.out.println(resultSet.getString("City") + " :: " + resultSet.getString("Country"));
            //System.out.println(resultSet.getString("Country") + " :<->: " + resultSet.getString("City"));
        }
    }
}
