package swingdemo;
import javax.swing.*;
import java.awt.*;
public class SwingMDI extends JFrame {
	 
	SwingMDI(){
	
		JDesktopPane jDex=new JDesktopPane();
		JInternalFrame jInternalFrame = new JInternalFrame("1");
		JInternalFrame jInternalFrame2 = new JInternalFrame("2");
	
		
		JLabel jLab = new JLabel("Inside Internal Frame 1");
		jLab.setText("experiment");
		JLabel jLab2 = new JLabel("Inside Internal Frame 2");
		
		jInternalFrame.setVisible(true);
		jInternalFrame2.setVisible(true);
		jDex.setVisible(true);
		jInternalFrame.setBounds(0,0,150,150);
		jInternalFrame2.setBounds(200,200,150,150);
		jInternalFrame.add(jLab);
		jInternalFrame2.add(jLab2);
		jDex.add(jInternalFrame);
		jDex.add(jInternalFrame2);
		
		add(jDex);
		
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("swing Conclusion");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SwingMDI sMDI = new SwingMDI();
	}
	
}
