import java.sql.*;

class PreparedStmt {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM students WHERE id=? AND"
                + " last_name=?");
            stmt.setInt(1, 1);
            stmt.setString(2, "Ji");
            ResultSet set = stmt.executeQuery();

            while (set.next()) {
                System.out.println(set.getString("first_name") + set.getString("last_name"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
