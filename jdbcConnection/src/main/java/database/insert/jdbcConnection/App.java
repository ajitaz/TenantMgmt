package database.insert.jdbcConnection;
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sagarmatha_jdbc","root","");
    Statement st = con.createStatement();
    String sql="INSERT INTO student(id,name,faculty,address) VALUES(2,'Utasv','BCA','Pokhara')";
    st.execute(sql);
    st.close();
    con.close();
    		
    }
    
       
    
}
