package database.insert.jdbcConnection;

import java.sql.*;


public class SelectQuery {
	public static void main(String[] args) {
		Connection con = null;
		Statement st= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sagarmatha_jdbc","root","");
			st = con.createStatement();
			String sql = "SELECT * FROM student";
			//"SELECT *FROM student WHERE address='ktm'"
			//"SELECT *FROM student WHERE address='"+location+"'";
			//"SELECT *FROM student WHERE address LIKE'pal%'";
			//"SELECT *FROM student WHERE address LIKE'%ara'";
			//"SELECT *FROM student WHERE address LIKE'%a%'";
			//"SELECT *FROM student WHERE address LIKE'_a%'";
			//"SELECT *FROM student WHERE address LIKE'___a%'";
			
			ResultSet rs =st.executeQuery(sql);
			System.out.println("Data");
			while(rs.next()) {
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("faculty")+"\t");
				System.out.println(rs.getString("address")+"\t");
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("Sorry cannot find driver class");
		}catch(SQLException e) {
			System.out.println("Sorry cannot close connection with database");
		}
	}
}
