package swingdemo;

import javax.swing.*;
public class SwingDemo extends JFrame {

	SwingDemo(){
		JPanel jpanel=new JPanel();
		
		
		
		JButton jbutton= new JButton();
		jbutton.setText("CLICK");
		
		JCheckBox jCheckBox = new JCheckBox("Apple");
		JCheckBox jCheckBox2 = new JCheckBox("Ball");
		jCheckBox2.setSelected(true);
		
	
		JRadioButton jRadio = new JRadioButton("DBZ");
		JRadioButton jRadio2= new JRadioButton("Manga");
		ButtonGroup buttonG = new ButtonGroup();
		buttonG.add(jRadio);
		buttonG.add(jRadio2);
	
		
		String[] header= {"Name","Class"};
		String[][] rows= {
				{"Ram","10"},
				{"Shyam","3"}
		};
		JTable jTable = new JTable(rows,header);
		jTable.setBounds(2,5,100,200);
		jpanel.add(jbutton);
		jpanel.add(new JScrollPane(jTable));
		jpanel.add(jCheckBox);
		jpanel.add(jCheckBox2);
		jpanel.add(jRadio);
		jpanel.add(jRadio2);
		
		add(jpanel);
		
		
		
		setVisible(true);
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing conclusion");
	}
	
	public static void main(String[] args) {
		SwingDemo sD=new SwingDemo();
		
	}
}
