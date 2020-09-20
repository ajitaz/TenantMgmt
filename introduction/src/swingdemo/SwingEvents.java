package swingdemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingEvents extends JFrame implements ActionListener{
	JTextField jText;
	JTextField jText2;
	JLabel jLab;
	JButton jButton ;
	JButton jButton2 ;
	SwingEvents(){
		JPanel jPanel = new JPanel();
		
		jText = new JTextField(20);
		jText2 = new JTextField(20);
		jLab = new JLabel();
		 jButton = new JButton("ADD");
		 jButton2 = new JButton("Subtract");
		jButton.addActionListener(this);
		jButton2.addActionListener(this);
//		jButton2.addActionListener(new ActionListener() {
//			@Override 
//			public void actionPerformed(ActionEvent e) {
//				
//					double a = Double.valueOf(jText.getText());
//					double b = Double.valueOf(jText2.getText());
//					double result = a-b;
//					jLab.setText("Result = "+result);
//				
//			}
//		});
		jPanel.add(jText);
		jPanel.add(jText2);
		jPanel.add(jButton);
		jPanel.add(jButton2);
		jPanel.add(jLab);
		add(jPanel);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing Event");
	}
	@Override 
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getSource().equals(jButton));	
		//jText.setText("Try me");
			//jText2.setText(jText.getText());
			
			if(e.getSource().equals(jButton)) {
				double a = Double.valueOf(jText.getText());
				double b = Double.valueOf(jText2.getText());
				double result = a+b;
				
				jLab.setText("Result = "+result);
			}else if(e.getSource().equals(jButton2)) {
				double a = Double.valueOf(jText.getText());
				double b = Double.valueOf(jText2.getText());
				double result = a-b;
				
				jLab.setText("Result = "+result);
			}
		
	}
	public static void main(String[] args) {
	 new SwingEvents();
	}

}
