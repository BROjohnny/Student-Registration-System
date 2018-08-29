
package databasepackage;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class databasecannection {
    public static Connection godatabase(){
        Connection x = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            x = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","");
            
        }
        catch(Exception e)
        {
            System.err.println("e");
        }
        return x;
    }
}
