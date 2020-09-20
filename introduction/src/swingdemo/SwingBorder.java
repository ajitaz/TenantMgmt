package swingdemo;
import javax.swing.*;
import java.awt.*;
public class SwingBorder extends JFrame {
	SwingBorder(){
		BorderLayout bLayout = new BorderLayout();
		JPanel jPanel = new JPanel(bLayout);
		JLabel north = new JLabel("North");
		JLabel east = new JLabel("East");
		JLabel south = new JLabel("South");
		JLabel west = new JLabel("West");
		JLabel center = new JLabel("Center");

		
		
		jPanel.add(north,BorderLayout.NORTH);
		jPanel.add(east,BorderLayout.EAST);
		jPanel.add(south,BorderLayout.SOUTH);
		jPanel.add(west,BorderLayout.WEST);
		jPanel.add(center,BorderLayout.CENTER);


		
		add(jPanel);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing Layout");
		
		
	}
	public static void main(String[] args) {
		SwingBorder sB= new SwingBorder();
	}

}
