package shoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class shoe {
    int items=0;
    int amount=0;
	private JFrame frame;
	private JTextField tb1;
	private JTextField tb0;
	private final JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shoe window = new shoe();
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
	public shoe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Downloads\\ygqeuiwgq.jpg"));
		frame.setBounds(100, 100, 568, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel TB1 = new JLabel("ITEMS");
		TB1.setForeground(new Color(255, 255, 255));
		TB1.setFont(new Font("Tahoma", Font.BOLD, 14));
		TB1.setBounds(241, 38, 46, 14);
		frame.getContentPane().add(TB1);
		
		tb1 = new JTextField();
		tb1.setBounds(338, 35, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel tb2 = new JLabel("AMOUNT");
		tb2.setForeground(new Color(255, 255, 255));
		tb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		tb2.setBounds(241, 96, 63, 14);
		frame.getContentPane().add(tb2);
		
		tb0 = new JTextField();
		tb0.setBounds(338, 93, 86, 20);
		frame.getContentPane().add(tb0);
		tb0.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+500;
				tb1.setText(""+items);
				tb0.setText(""+amount);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\s2.jpg"));
		btnNewButton.setBounds(22, 133, 115, 168);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+600;
				tb1.setText(""+items);
				tb0.setText(""+amount);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\s44"));
		btnNewButton_1.setBounds(176, 131, 128, 173);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+700;
				tb1.setText(""+items);
				tb0.setText(""+amount);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\bnm.jpg"));
		btnNewButton_2.setBounds(348, 124, 138, 180);
		frame.getContentPane().add(btnNewButton_2);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 273, 98, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RS/500");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(74, 312, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RS/600");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(203, 315, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS/700");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(398, 315, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("S H O E S T O R E");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(41, 30, 157, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("600");
		lblNewLabel_5.setBounds(203, 315, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\ygqeuiwgq.jpg"));
		lblNewLabel_8.setBounds(0, 0, 542, 348);
		frame.getContentPane().add(lblNewLabel_8);
	}
}
