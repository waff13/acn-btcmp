package Day06;

import java.sql.*;

public class Task02 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String pathToDB = "C:\\Users\\mojma\\IdeaProjects\\acn-btcmp\\chinook.db";

        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + pathToDB);

        Statement statement = connection.createStatement();

        statement.execute("SELECT Name, Composer, AlbumId, Milliseconds\n" +
                "FROM tracks\n" +
                "WHERE AlbumId BETWEEN 7 AND 9 AND Composer NOTNULL");

        ResultSet resultSet = statement.getResultSet();
        System.out.println("Id\tLength, ms\tSong title\t\tComposer");
        while(resultSet.next()){
            System.out.println(resultSet.getInt("AlbumId") + "\t" + resultSet.getInt("Milliseconds") +
                    "\t\t" + resultSet.getString("Name") + "\t\t" + resultSet.getString("Composer"));
        }
    }
}
