package database.insert.jdbcConnection;
import java.sql.*;
public class UpdateQuery {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/sagarmatha_jdbc","root","");
			st = con.createStatement();
			String sql ="UPDATE student SET name='Utsav' WHERE id =3";
			st.executeUpdate(sql);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Sorry cannot find driver class");
		}catch(SQLException e) {
			System.out.println("Cannot connect to database");
		}finally {
			try {
				st.close();
				con.close();
				
			}catch(SQLException e) {
				System.out.println("sorry cannot close connection with database");
			}
		}
	}

}
