
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class myq {
    public static void main(String[] args) {
        

        String url = "jdbc:mysql://localhost:3306/program";
        String user = "root";
        String password = "caddcenter";

        try
        {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            System.out.println("connected to mysql");

            st.executeUpdate
            (
                "CREATE TABLE IF NOT EXISTS student("+
                "id INT PRIMARY KEY,"+
                "name VARCHAR(50))"
            );
            System.out.println(" table ready");

            st.executeUpdate("INSERT INTO student VALUES(1,'kamal')");
            st.executeUpdate("INSERT INTO student VALUES(2,'kamalesh')");
            System.out.println("data inserted");

            ResultSet rs = st.executeQuery("SELECT * FROM student");
            System.out.println("student records:");
            while (rs.next()) 
            {
                System.out.println(rs.getInt("id") + " " +rs.getString("name"));

            }
            st.executeUpdate("UPDATE student set name='arun' WHERE id=2");
            System.out.println("data updated");

            st.executeUpdate("DETETE FROM student WHERE id = 1");
            System.out.println("data deleted");
            
            con.close();

            System.out.println("connection closed");

        } catch(Exception e) {
            System.out.println(e);
        }
        }
        
    }
