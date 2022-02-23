package Day06;

import java.sql.*;

public class Task01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String pathToDB = "C:\\Users\\mojma\\IdeaProjects\\acn-btcmp\\chinook.db";

        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + pathToDB);

        Statement statement = connection.createStatement();

        statement.execute("SELECT * FROM albums LIMIT 10");

        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            System.out.println(resultSet.getInt("AlbumId") + " " + resultSet.getString("Title"));
        }
    }
}
