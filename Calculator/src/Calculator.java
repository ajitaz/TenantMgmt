import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secnum;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setIgnoreRepaint(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(23, 0, 404, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn1.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn1.setBounds(35, 95, 51, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(108, 95, 51, 40);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(181, 95, 51, 40);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(35, 142, 51, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(108, 142, 51, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(181, 142, 51, 40);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(35, 189, 51, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(108, 189, 51, 40);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn9	.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(181, 189, 51, 40);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(108, 236, 51, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setBounds(350, 95, 51, 40);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setBounds(350, 142, 51, 40);
		frame.getContentPane().add(btnminus);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secnum= Double.parseDouble(textField.getText());
				if (operation=="+") {
					result=firstnum + secnum;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "-") {
					result=firstnum-secnum;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnequal.setBounds(350, 189, 51, 40);
		frame.getContentPane().add(btnequal);
		
		JButton button = new JButton(".");
		button.setBounds(35, 236, 51, 40);
		frame.getContentPane().add(button);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(181, 236, 51, 40);
		frame.getContentPane().add(btnC);
	}
}
