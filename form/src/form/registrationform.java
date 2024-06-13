package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationform {

	private JFrame frame;
	private JTextField tb0;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform window = new registrationform();
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
	public registrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(47, 54, 58, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLLNO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 100, 60, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb0 = new JTextField();
		tb0.setBounds(187, 55, 86, 20);
		frame.getContentPane().add(tb0);
		tb0.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(187, 101, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(45, 151, 76, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE"}));
		cb1.setBounds(187, 147, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(37, 195, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Tahoma", Font.BOLD, 14));
		r1.setBounds(132, 191, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Tahoma", Font.BOLD, 14));
		r2.setBounds(239, 191, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(47, 206, 68, 70);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setBounds(111, 232, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setFont(new Font("Tahoma", Font.BOLD, 15));
		c3.setBounds(319, 232, 97, 23);
		frame.getContentPane().add(c3);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 15));
		c2.setBounds(210, 232, 97, 23);
		frame.getContentPane().add(c2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tb0.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender="";
				String langs="";
				
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs=langs+"c";
				}
				if(c2.isSelected())
				{
					langs=langs+"java";
				}
				if(c3.isSelected())
				{
					langs=langs+"python";
				}
				JOptionPane.showMessageDialog(btnNewButton, "Name :"+name+"\n ROLLNO :"+rollno+"\nBranch :"+branch+"\nGENDER:"+gender+"\nPROG LANGS :"+langs);
			}
			
		
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(172, 268, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENTREGISTRATION FORM");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(91, 11, 238, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
