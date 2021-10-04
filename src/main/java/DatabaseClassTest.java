import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class DatabaseClassTest {
    public static void main(String args[]){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(
           "jdbc:postgresql://132.145.174.241:5432/iwmsdb","intellinum","Robust#123");
//here sonoo is database name, root is username and password
            String[] returnId = { "creation_date" };
            PreparedStatement stmt= con.prepareStatement("insert into iwms.iwms_xx_debug values('abc')",returnId);
            int value= stmt.executeUpdate();
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    System.out.println(rs.getObject(1));
                }
                rs.close();
            }
            con.close();

        }catch(Exception e){ System.out.println(e);}
    }
}
