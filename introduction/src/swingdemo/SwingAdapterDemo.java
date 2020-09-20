package swingdemo;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class SwingAdapterDemo extends JFrame {
	
	SwingAdapterDemo(){
		JPanel jPan = new JPanel();
		JTextField jText = new JTextField(10);
		JTextField jText2 = new JTextField(10);
		JTextField jText3 = new JTextField(30);
		JTextArea ja = new JTextArea(50,50);
		JLabel jLab = new JLabel("Result =");
		JButton jButton = new JButton("Add");
		JButton jButton2 = new JButton("TEST");
		JButton jButton3 = new JButton("MULTIPLY");
		JButton jB = new JButton("Revel");
		
		jButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e ) {
				double a= Double.valueOf(jText.getText());
				double b= Double.valueOf(jText2.getText());
				double result = a+b;
				jLab.setText("Result= "+result);
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
		
		
		jButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double a= Double.valueOf(jText.getText());
				double b= Double.valueOf(jText2.getText());
				double result= a*b;
				jLab.setText("Result= " + result);
			}
		});
		
		jB.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked (MouseEvent ab) {
				String s = null;			
					try {
					FileReader fr = new FileReader("hoho.txt");
					BufferedReader br =new BufferedReader(fr);

					
			while((s=br.readLine())!=null) {
				ja.append(s+"\n");
				System.out.println(s);
			}
			br.close();
			}catch(Exception e){
				System.out.println(e);
			}
			}	
		});
		
		jPan.add(jText);
		jPan.add(jText2);
		
		jPan.add(jButton);
		jPan.add(jButton2);
		jPan.add(jButton3);
		jPan.add(jB);
		jPan.add(jLab);
		jPan.add(jText3);
		jPan.add(ja);
		add(jPan);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing Mouse");
		
	}
	
	
	public static void main(String[] args) {
		SwingAdapterDemo sAD = new SwingAdapterDemo();
		
	}
}
