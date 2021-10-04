import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import net.sf.saxon.expr.MappingIterator;
import org.json.JSONObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

public class CSVtoDbInsertion {

    public static void main(String args[]){

        try {
            PreparedStatement preparedStatement = null;
              HikariConfig config = new HikariConfig();
              config.setDriverClassName("org.postgresql.Driver");
              config.setJdbcUrl("jdbc:postgresql://150.136.110.79:5432/iwmsdb?currentSchema=iwms");
              config.setUsername("intellinum");
              config.setPassword("admin");
              HikariDataSource ds = new HikariDataSource(config);
              Connection connection = ds.getConnection();
              connection.setAutoCommit(false);
              String csvStringEncoded = "eF92YWx1ZXMsZGF0ZQoxLDEwLzExLzIwMjAKMiwxMS8xMS8yMDIwCjMsMTIvMTEvMjAyMAo0LDEzLzExLzIwMjAKNSwxNC8xMS8yMDIwCg==";

              byte[] decoded = Base64.getDecoder().decode(csvStringEncoded);
              String decodedString = new String(decoded);
              System.out.println(decodedString);
              //System.out.println(decoded.toString());
             // System.out.println(decoded.length);
              String [] arrayStr=decodedString.split("\\r?\\n");
              String[] headers = arrayStr[0].split(",");
              System.out.println(headers[0]+"   "+(arrayStr.length-1));
              String key = null;
              for (int i = 1; i <= arrayStr.length - 1; i++) {
                  String[] s = arrayStr[i].split(",");
                  System.out.println(" Values  "+arrayStr[i]+"  "+ s[0]+"  "+s[1]);
                  String query = "insert into iwms.xx_debug(value) values (?)";
                  preparedStatement = connection.prepareStatement(query);
                  preparedStatement.setString(1, s[0]);
                 // preparedStatement.setTimestamp(2, (Timestamp) new Date());
                  int result1 = preparedStatement.executeUpdate();
                 
              }
            preparedStatement.close();
            connection.setAutoCommit(true);
            if (preparedStatement != null)
                preparedStatement.close();
            preparedStatement = null;

            if (connection != null)
                connection.close();
            connection = null;
            ds.close();

          }catch (SQLException throwables) {
              throwables.printStackTrace();
          }
    }
}
