import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + Paths.get("").toAbsolutePath() + File.separator + "TestDB" + File.separator + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING); Statement statement = conn.createStatement();) {
//            conn.setAutoCommit(false);
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS + "(" + COLUMN_NAME +" TEXT, " + COLUMN_PHONE + " INTEGER, " + COLUMN_EMAIL + " TEXT)");
            statement.execute("INSERT INTO " + TABLE_CONTACTS+ "(" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") VALUES('Tim', 6545678, 'tim@email.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS+ "(" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") VALUES('Joe', 45632, 'joe@anywhere.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS+ "(" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") VALUES('Jane', 4829484, 'jane@somewhere.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS+ "(" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") VALUES('Fido', 9038, 'dog@email.com')");
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + "=5566789 WHERE " + COLUMN_NAME + "='Jane'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + "='Joe'");
            statement.execute("SELECT * FROM " + TABLE_CONTACTS);
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) + " " + results.getString(COLUMN_EMAIL));
            }
            results.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
