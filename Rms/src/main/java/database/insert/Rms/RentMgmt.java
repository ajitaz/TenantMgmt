package database.insert.Rms;
import java.sql.*;
import java.util.Set;
import java.util.TreeSet;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class RentMgmt {

	private JFrame frame;
	private JTextField textField;
	private JTable table_1;
	private DefaultTableModel dtm;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentMgmt window = new RentMgmt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RentMgmt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ViewButton = new JButton("View");
		ViewButton.setBackground(Color.GRAY);
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText("Database not Connected");
				try {
					dbView();
				}catch(Exception SQLException) {
				System.out.println("error");
			}
		}
		});
		
		
		ViewButton.setBounds(12, 40, 114, 25);
		frame.getContentPane().add(ViewButton);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				try {
				dbCon();
				}catch (Exception SQLException) {
					System.out.println("Sorry cannot close connection with database");
				}
			}
		});
		AddButton.setForeground(Color.GRAY);
		AddButton.setBackground(Color.DARK_GRAY);
		AddButton.setBounds(12, 66, 114, 25);
		frame.getContentPane().add(AddButton);
		
		textField = new JTextField();
		textField.setBounds(174, 21, 194, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
//		String[] header = {"Name","Fees","Date"};
		dtm = new DefaultTableModel();
		dtm.addColumn("Name");
		dtm.addColumn("Fees");
		dtm.addColumn("Date");
		
		
		table_1 = new JTable(dtm);
		table_1.setBounds(100, 100, 350, 350);
		//frame.getContentPane().add(table_1);
		 
		
		 JScrollPane scrollPane = new JScrollPane(table_1);
			scrollPane.setBounds(100, 100, 350, 350);
			frame.getContentPane().add(scrollPane);
		

	
		
	}
	
	public void dbCon() throws ClassNotFoundException,SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=null;
		 Statement st=null;
		 try {   
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/RentMgmt","root","");
		     st = con.createStatement();
		    String sql="INSERT INTO record(Id,Name,Ph,Date) VALUES(4,'prabhas','23560','2020/2/5')";
		    st.execute(sql);
		    
		 }catch(SQLException e) {
			 st.close();
			 con.close();
			 System.out.println("Sorry cannot close connection with database");
		 }
	}
	
	public void dbView() throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;
		Statement st=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/RentMgmt","root","");
			st=con.createStatement();
			String sql="SELECT * FROM record";
			ResultSet rs =st.executeQuery(sql);
			Set<String> data = new TreeSet<String>();
			while(rs.next()) {
//				System.out.print(rs.getInt("Id")+"\t");
//				System.out.print(rs.getString("Name")+"\t");
//				System.out.print(rs.getInt("Ph")+"\t");
//				System.out.println(rs.getDate("Date"));
				data.add(rs.getString("Name")+"\t"+rs.getInt("Ph")+"\t"+rs.getDate("Date"));
			    String[] elements = {rs.getString("Name"),rs.getInt("Ph")+"",rs.getDate("Date")+""}; 
			    dtm.addRow(elements);
			}
			for(String var:data) {
				System.out.println(var);
			}
		}catch(SQLException e) {
			System.out.println(e);
	}
}
}
