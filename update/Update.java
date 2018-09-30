import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class Update {
    public static void main(String args[]) {
        String dbUrl = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pw = "root";
        try {
            Connection myConn = DriverManager.getConnection(dbUrl, user, pw);
            Statement mystmt = myConn.createStatement();

            String updateQuery = "UPDATE students"
                + " SET last_name='Ji'"
                + " WHERE id=2";
            mystmt.executeUpdate(updateQuery);
            System.out.println("Update completed");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
