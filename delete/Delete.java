import java.sql.*;

class Delete {
    public static void main (String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "root";

        try {
            Connection myConn = DriverManager.getConnection(url, user, pass);
            Statement mystmt = myConn.createStatement();
            String query = "DELETE from students WHERE id=2";

            mystmt.executeUpdate(query);
            System.out.println("Delete Completed");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
