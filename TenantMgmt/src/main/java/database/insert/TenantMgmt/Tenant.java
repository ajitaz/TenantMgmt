package database.insert.TenantMgmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tenant {

	private JFrame frame;
	private JLayeredPane layeredPane_1;
	private JPanel view;
	private JPanel edit;
	private JPanel add;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JTextField firstName;
	private JTextField lastName;
	private JLabel lblPhoneNo;
	private JTextField phNumber;
	private JLabel lblDate;
	private JTextField date;
	private JLabel lblUnit;
	private JTextField unitNo;
	private JLabel lblId;
	private JTextField addId;
	private JLabel lblId_1;
	private JTextField editId;
	private JLabel lblName;
	private JTextField editFirstName;
	private JLabel lblLastName_1;
	private JTextField editLastName;
	private JLabel lblDate_1;
	private JTextField editDate;
	private JLabel lblUnit_1;
	private JTextField editUnit;
	private JButton btnEdit_1;
	private JPanel Evaluate;
	private JTextField editPhNo;
	private JLabel lblPhNo;
	private JButton btnDelete;
	private JButton btnCheck;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel dtm;
	private JLabel lblRoom;
	private JTextField editRoom;
	private JLabel lblRoom_1;
	private JTextField addRoom;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private DefaultTableModel dtm2;
	CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tenant window = new Tenant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
		/**
		 * Button functions
		 */
	private Scanner scan;
	private String filepath ="tenant.txt"; //Record File name.........
	
	
	
	
	
		public void showRecord() {
		String[] elements;
		String Id ,fName ,lName ,pN ,date ,unit,room,prevUnit;
		while(dtm.getRowCount() > 0)
		{
			dtm.removeRow(0);
		}
		try {
			scan = new Scanner(new File(filepath));
			scan.useDelimiter("[,\n]");
			
		while(scan.hasNext()) {
			Id = scan.next();
			fName = scan.next();
			lName = scan.next();
			pN = scan.next();
			date = scan.next();
			unit = scan.next();
			room = scan.next();
			prevUnit=scan.next();
			elements = new String[] {Id,fName,lName,pN,date,unit,prevUnit,room};
			dtm.addRow(elements);
		}
		scan.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public  void addRecord(String ID,String fName,String lName,String pN,String date,String unit,String room)  {
		try {
		FileWriter fw = new FileWriter(filepath,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println(ID+","+fName+","+lName+","+pN+","+date+","+unit+","+room+","+"0");
		pw.flush();
		pw.close();
		
		JOptionPane.showMessageDialog(null,"Record saved");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Record not saved");
		}
	}
	
	public  void editRecord(String newId,String newfName,String newlName,String newpN,String newdate,String newunit,String newroom) {
		String tempFile = "temp.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempFile);
		String Id, name, last, ph, date, unit,room,prevUnit;
		
		try {
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			scan = new Scanner(new File(filepath));
			scan.useDelimiter("[,\n]");
			
			while(scan.hasNext()) {
				Id = scan.next();
				name = scan.next();
				last = scan.next();
				ph = scan.next();
				date = scan.next();
				unit = scan.next();
				room = scan.next();
				prevUnit = scan.next();
				if(Id.equals(editId.getText())) {
					pw.println(newId+","+newfName+","+newlName+","+newpN+","+newdate+","+newunit+","+newroom+","+unit);

				}
				else {
					pw.println(Id+","+name+","+last+","+ph+","+date+","+unit+","+room+","+prevUnit);
				}
			}
			
			scan.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File dump = new File(filepath);
			newFile.renameTo(dump);
			JOptionPane.showMessageDialog(null, "Successfuly edited");
			
		}catch(Exception e){
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Cannot edit");
		}
	}
	
	
	public void deleteRecord(String Id) {
		String temp = "temp.txt";
		File oldFile = new File(filepath);
		File newFile = new File(temp);
		String ID ,fName ,lName ,pN ,date ,unit,room,prevUnit;
		
		try {
			FileWriter fw = new FileWriter(temp);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			scan = new Scanner(new File(filepath));
			scan.useDelimiter("[,\n]");
			
			while(scan.hasNext()) {
				ID = scan.next();
				fName = scan.next();
				lName = scan.next();
				pN = scan.next();
				date = scan.next();
				unit = scan.next();
				room = scan.next();
				prevUnit = scan.next();
				if(!ID.equals(Id)) {
					pw.println(ID+","+fName+","+lName+","+pN+","+date+","+unit+","+room+","+prevUnit);
				}
				
			}
			scan.close();
			pw.flush();
			pw.close();
			
			oldFile.delete();
			File dump = new File(filepath);
			newFile.renameTo(dump);
			JOptionPane.showMessageDialog(null, "Successfuly Deleted");
		}catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Cannot Delete");
		}
	}
	
	
	public void checkRecord(String Id) {
		String id ,fName ,lName ,pN ,date ,unit,room;
		boolean found = false;
		try {
			scan = new Scanner(new File(filepath));
			scan.useDelimiter("[,\n]");
			while(scan.hasNext() && !found){
			id = scan.next();
			fName = scan.next();
			lName = scan.next();
			pN = scan.next();
			date = scan.next();
			unit =scan.next();
			room = scan.next();
			scan.next();//skipping prevUnit
			if(id.equals(Id)) {
				editFirstName.setText(fName);
				editLastName.setText(lName);
				editDate.setText(date);
				editPhNo.setText(pN);
				editUnit.setText(unit);
				editRoom.setText(room);
				found = true;
			}	
			}
			scan.close();
		}catch(Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Check error");
		}
	}

	public void evaluate() {
		String[] elements;
		String id ,fName ,lName ,unit,room,cUnit,prevUnit,unitAmt,rent,total;
		 
		while(dtm2.getRowCount() > 0)
		{
			dtm2.removeRow(0);
		}
		try {
			scan = new Scanner(new File(filepath));
			scan.useDelimiter("[,\n]");
			
			while(scan.hasNext()) {
				id = scan.next();
				fName = scan.next();
				lName = scan.next();
				scan.next();//skipping value
				scan.next();
				unit =scan.next();
				room = scan.next();
				prevUnit = scan.next();
				cUnit = String.valueOf(Double.valueOf(unit)-Double.valueOf(prevUnit));
				unitAmt = String.valueOf(Double.valueOf(cUnit)*11);
				if(Double.valueOf(unitAmt) < 50) {
					unitAmt="50";
				}
				rent = String.valueOf(Double.valueOf(room)*3000);
				switch(Integer.valueOf(id)) {
				case 8: rent = String.valueOf(Double.valueOf(room)*2500);
						break;
				case 9:	rent = String.valueOf(Double.valueOf(room)*2000);
						break;
				
				}
				total = String.valueOf(Double.valueOf(unitAmt)+Double.valueOf(rent));
				elements = new String[] {id,fName+" "+lName,cUnit,unitAmt,rent,total};
				dtm2.addRow(elements);
			}
			scan.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Create the application.
	 */
	public Tenant() {
		initialize();
		cardLayout=(CardLayout)(layeredPane_1.getLayout());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(12, 47, 708, 296);
		frame.getContentPane().add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		view = new JPanel();
		layeredPane_1.add(view, "name_7205296383525");
		view.setLayout(null);
		
		dtm = new DefaultTableModel();
		dtm.addColumn("ID");
		dtm.addColumn("FirstName");
		dtm.addColumn("LastName");
		dtm.addColumn("Phone No.");
		dtm.addColumn("Date");
		dtm.addColumn("Unit");
		dtm.addColumn("Previous Unit");
		dtm.addColumn("Room");

		
		table = new JTable(dtm);
		table.setBounds(12, 59, 527, 225);
//		view.add(table);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 59, 684, 225);
		view.add(scrollPane);
		
		
		
		edit = new JPanel();
		layeredPane_1.add(edit, "name_7207926847090");
		edit.setLayout(null);
		
		lblId_1 = new JLabel("ID:");
		lblId_1.setBounds(12, 32, 66, 15);
		edit.add(lblId_1);
		
		editId = new JTextField();
		editId.setBounds(31, 32, 66, 19);
		edit.add(editId);
		editId.setColumns(10);
		
		lblName = new JLabel("First Name:");
		lblName.setBounds(12, 59, 104, 15);
		edit.add(lblName);
		
		editFirstName = new JTextField();
		editFirstName.setBounds(93, 57, 124, 19);
		edit.add(editFirstName);
		editFirstName.setColumns(10);
		
		lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setBounds(235, 59, 104, 15);
		edit.add(lblLastName_1);
		
		editLastName = new JTextField();
		editLastName.setBounds(318, 57, 124, 19);
		edit.add(editLastName);
		editLastName.setColumns(10);
		
		lblDate_1 = new JLabel("Date:");
		lblDate_1.setBounds(12, 114, 66, 15);
		edit.add(lblDate_1);
		
		editDate = new JTextField();
		editDate.setBounds(50, 112, 124, 19);
		edit.add(editDate);
		editDate.setColumns(10);
		
		lblUnit_1 = new JLabel("Unit:");
		lblUnit_1.setBounds(12, 141, 66, 15);
		edit.add(lblUnit_1);
		
		editUnit = new JTextField();
		editUnit.setBounds(50, 141, 50, 19);
		edit.add(editUnit);
		editUnit.setColumns(10);
		
		lblPhNo = new JLabel("Phone No:");
		lblPhNo.setBounds(12, 86, 104, 15);
		edit.add(lblPhNo);
		
		editPhNo = new JTextField();
		editPhNo.setBounds(84, 86, 124, 19);
		edit.add(editPhNo);
		editPhNo.setColumns(10);
		
		btnEdit_1 = new JButton("Edit");
		btnEdit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			editRecord(editId.getText(),editFirstName.getText(),editLastName.getText(),editPhNo.getText(),editDate.getText(),editUnit.getText(),editRoom.getText());
			}
		});
		
		lblRoom = new JLabel("Room:");
		lblRoom.setBounds(12, 168, 66, 15);
		edit.add(lblRoom);
		
		editRoom = new JTextField();
		editRoom.setBounds(66, 168, 41, 19);
		edit.add(editRoom);
		editRoom.setColumns(10);
		btnEdit_1.setBounds(439, 221, 114, 25);
		edit.add(btnEdit_1);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteRecord(editId.getText());
			}
		});
		btnDelete.setBounds(439, 258, 114, 25);
		edit.add(btnDelete);
		
		btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkRecord(editId.getText());
			}
		});
		btnCheck.setBounds(439, 180, 114, 25);
		edit.add(btnCheck);
		
		add = new JPanel();
		layeredPane_1.add(add, "name_7209976188193");
		add.setLayout(null);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 33, 116, 15);
		add.add(lblFirstName);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 55, 116, 15);
		add.add(lblLastName);
		
		firstName = new JTextField();
		firstName.setBounds(110, 33, 124, 19);
		add.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setBounds(110, 55, 124, 19);
		add.add(lastName);
		lastName.setColumns(10);
		
		lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setBounds(12, 77, 97, 15);
		add.add(lblPhoneNo);
		
		phNumber = new JTextField();
		phNumber.setBounds(110, 77, 124, 19);
		add.add(phNumber);
		phNumber.setColumns(10);
		
		lblDate = new JLabel("Date:");
		lblDate.setBounds(12, 103, 66, 15);
		add.add(lblDate);
		
		date = new JTextField();
		date.setBounds(110, 103, 124, 19);
		add.add(date);
		date.setColumns(10);
		
		lblUnit = new JLabel("Unit:");
		lblUnit.setBounds(12, 125, 66, 15);
		add.add(lblUnit);
		
		unitNo = new JTextField();
		unitNo.setBounds(110, 125, 124, 19);
		add.add(unitNo);
		unitNo.setColumns(10);
		
		Evaluate = new JPanel();
		layeredPane_1.add(Evaluate, "name_15600966865066");
		Evaluate.setLayout(null);
		
		dtm2 = new DefaultTableModel();
		dtm2.addColumn("ID");
		dtm2.addColumn("Name");
		dtm2.addColumn("Current Unit");
		dtm2.addColumn("Unit Amount");
		dtm2.addColumn("Rent Amount");
		dtm2.addColumn("Total");
		
		table_1 = new JTable(dtm2);
		table_1.setBounds(0, 0, 1, 1);
//		Evaluate.add(table_1);
		
		scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(12, 40, 684, 244);
		Evaluate.add(scrollPane_1);
		
		
		
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addRecord( addId.getText(),firstName.getText(),lastName.getText(),phNumber.getText(),date.getText(),unitNo.getText(),addRoom.getText());
			}
		});
		btnAdd_1.setBounds(439, 259, 114, 25);
		add.add(btnAdd_1);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(290, 33, 66, 15);
		add.add(lblId);
		
		addId = new JTextField();
		addId.setText("");
		addId.setBounds(319, 33, 66, 19);
		add.add(addId);
		addId.setColumns(10);
		
		lblRoom_1 = new JLabel("Room:");
		lblRoom_1.setBounds(12, 150, 66, 15);
		add.add(lblRoom_1);
		
		addRoom = new JTextField();
		addRoom.setBounds(110, 150, 124, 19);
		add.add(addRoom);
		addRoom.setColumns(10);
		
		JButton btnView = new JButton("Records");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane_1, "name_7205296383525");
				showRecord();
			}
		});
		btnView.setBounds(23, 24, 114, 25);
		frame.getContentPane().add(btnView);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayout.show(layeredPane_1, "name_7207926847090");
			}
		});
		btnEdit.setBounds(168, 24, 114, 25);
		frame.getContentPane().add(btnEdit);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayout.show(layeredPane_1, "name_7209976188193");
			}
		});
		btnAdd.setBounds(314, 24, 114, 25);
		frame.getContentPane().add(btnAdd);
		
		
		JButton btnEvaluate = new JButton("Evaluate");
		btnEvaluate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane_1, "name_15600966865066");
				evaluate();
			}
		});
		btnEvaluate.setBounds(455, 24, 114, 25);
		frame.getContentPane().add(btnEvaluate);
	}
}
