package database.insert.TenantMgmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class beta {

	private JFrame frame;
	private JLayeredPane layeredPane_1;
	private JPanel view;
	private JPanel edit;
	private JPanel add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					beta window = new beta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel) {
//		JLayeredPane layeredPane = new JLayeredPane();
//		layeredPane.removeAll();
//		layeredPane.add(panel);
//		layeredPane.repaint();
//		layeredPane.revalidate();
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
		
		
	}


	/**
	 * Create the application.
	 */
	public beta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(12, 85, 416, 173);
		frame.getContentPane().add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		view = new JPanel();
		layeredPane_1.add(view, "name_6798372486902");
		view.setLayout(null);
		
		JLabel lblViewRecord = new JLabel("view record");
		lblViewRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewRecord.setBounds(49, 43, 276, 82);
		view.add(lblViewRecord);
		
		edit = new JPanel();
		layeredPane_1.add(edit, "name_6802565694807");
		edit.setLayout(null);
		
		JLabel lblEditRecord = new JLabel("edit record");
		lblEditRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditRecord.setBounds(54, 39, 276, 82);
		edit.add(lblEditRecord);
		
		add = new JPanel();
		layeredPane_1.add(add, "name_6807658867075");
		add.setLayout(null);
		
		JLabel lblAddNew = new JLabel("add new ");
		lblAddNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNew.setBounds(59, 46, 276, 82);
		add.add(lblAddNew);
		
		JButton btnViewRecords = new JButton("View Records");
		btnViewRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(view);
			}
		});
		btnViewRecords.setBounds(26, 32, 114, 25);
		frame.getContentPane().add(btnViewRecords);
		
		JButton btnEditRecord = new JButton("Edit Record");
		btnEditRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(edit);
			}
		});
		btnEditRecord.setBounds(172, 32, 114, 25);
		frame.getContentPane().add(btnEditRecord);
		
		JButton btnAddNew = new JButton("Add New ");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(add);
			}
		});
		btnAddNew.setBounds(308, 32, 114, 25);
		frame.getContentPane().add(btnAddNew);
	}
}
