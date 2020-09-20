package database.insert.jdbcConnection;
import java.sql.*;
public class DeleteQuery {
	public static void main(String[] args) {
		Connection con = null;
		Statement st= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sagarmatha_jdbc","root","");
			st = con.createStatement();
		String	sql = "DELETE FROM student WHERE id=3";
			st.execute(sql);
		}catch(ClassNotFoundException e) {
			System.out.println("sorry cannot find driver class");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("syntax error");
		}finally {
			try {
				st.close();
				con.close();
			}catch(SQLException e) {
				System.out.println("Sorry cannot close connection with database");
			}
		}
	}
}
