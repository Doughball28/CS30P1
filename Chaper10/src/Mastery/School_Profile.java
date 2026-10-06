package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class School_Profile {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					School_Profile window = new School_Profile();
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
	public School_Profile() {
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
		
		FN = new JTextField();
		FN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(FN.getText().equals("First Name"))
				{
					FN.setText("");
				}
			}
		});
		FN.setText("First Name");
		FN.setBounds(10, 33, 104, 20);
		frame.getContentPane().add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(LN.getText().equals("Last Name"))
				{
					LN.setText("");
				}
			}
		});
		LN.setText("Last Name");
		LN.setBounds(122, 33, 113, 20);
		frame.getContentPane().add(LN);
		LN.setColumns(10);
		String grade = ("");
		JComboBox Grade = new JComboBox();
		Grade.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Grade.getSelectedItem().equals("10"))
				{
					String grade = ("10");
				}
				if(Grade.getSelectedItem().equals("11"))
				{
					String grade = ("11");
				}
				if(Grade.getSelectedItem().equals("12"))
				{
					String grade = ("12");
				}
			}
		});
		Grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grade.setBounds(10, 83, 74, 22);
		frame.getContentPane().add(Grade);
		String school = ("");
		JComboBox School = new JComboBox();
		School.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(School.getSelectedItem().equals("School1"))
				{
					String school = ("School1");
				}
				if(School.getSelectedItem().equals("School2"))
				{
					String school = ("School2");
				}
				if(School.getSelectedItem().equals("School3"))
				{
					String school = ("School3");
				}
				if(School.getSelectedItem().equals("School4"))
				{
					String school = ("School4");
				}
				if(School.getSelectedItem().equals("School5"))
				{
					String school = ("School5");
				}
				
			}
		});
		School.setModel(new DefaultComboBoxModel(new String[] {"School1", "School2", "School3", "School4", "School5"}));
		School.setBounds(131, 83, 104, 22);
		frame.getContentPane().add(School);
		
		JLabel description = new JLabel("");
		description.setBounds(10, 116, 225, 61);
		frame.getContentPane().add(description);
		
		JLabel Image = new JLabel("");
		Image.setBounds(10, 188, 145, 73);
		frame.getContentPane().add(Image);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String firstN = FN.getText();
				String lastN = LN.getText();
				
				description.setText(firstN + " " + lastN +  "is in grade: " + grade + "and goes to" + school);
			}
		});
		Submit.setBounds(271, 11, 89, 134);
		frame.getContentPane().add(Submit);
	}
}
