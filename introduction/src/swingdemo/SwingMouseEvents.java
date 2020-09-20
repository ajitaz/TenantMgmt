package swingdemo;
import javax.swing.*;
import java.awt.event.*;
public class SwingMouseEvents extends JFrame{
	SwingMouseEvents(){
		JPanel jPanel = new JPanel();
		JTextField jText = new JTextField(10);
		JTextField jText2 = new JTextField(10);
		JButton jButton = new JButton("Add");
		JButton jButton2 = new JButton("Demo");
		JLabel jLab = new JLabel();
		jButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double a= Double.valueOf(jText.getText());
				double b= Double.valueOf(jText2.getText());
				double result = a+b;
				jLab.setText(" "+result);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				jButton2.setText("Entered");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jButton2.setText("Enter");
			}
			
		});
	jPanel.add(jText);
	jPanel.add(jText2);
	jPanel.add(jButton);
	jPanel.add(jButton2);
	jPanel.add(jLab);
	add(jPanel);
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Swing Mouse");
	
		

		
	}
	public static void main(String[] args) {
		SwingMouseEvents sME = new SwingMouseEvents();
	}

}