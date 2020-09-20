package swingdemo;
import javax.swing.*;
import java.awt.*;
public class SwingLayout extends JFrame {
	SwingLayout(){
		FlowLayout flowLayout = new FlowLayout();
		//GridLayout flowLayout = new GridLayout(2,2);(row,column)
		JPanel jPanel = new JPanel(flowLayout);
		JLabel jLable = new JLabel("JLable1");
		JLabel jLable2 = new JLabel("JLable2");
		JLabel jLable3 = new JLabel("JLable3");
		
		jPanel.add(jLable);
		jPanel.add(jLable2);
		jPanel.add(jLable3);
		
		add(jPanel);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing Layout");
		
	}
	public static void main(String[] args) {
		SwingLayout sL= new SwingLayout();
	}
}
