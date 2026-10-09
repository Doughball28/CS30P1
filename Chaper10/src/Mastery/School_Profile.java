package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

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
		
		
		ImageIcon chhs = new ImageIcon("../Chaper10/src/Mastery/images.png");
		ImageIcon abe = new ImageIcon("../Chaper10/src/Mastery/images(1).png");
		ImageIcon nelson = new ImageIcon("../Chaper10/src/Mastery/Nelson.png");
		ImageIcon fowler = new ImageIcon("../Chaper10/src/Mastery/fowler.png");
		ImageIcon pearson = new ImageIcon("../Chaper10/src/Mastery/pearson.png");

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
		FN.setBounds(10, 11, 104, 20);
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
		LN.setBounds(124, 11, 113, 20);
		frame.getContentPane().add(LN);
		LN.setColumns(10);
		JComboBox Grade = new JComboBox();
		Grade.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		Grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grade.setBounds(10, 42, 74, 22);
		frame.getContentPane().add(Grade);
		JComboBox School = new JComboBox();
		School.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		School.setModel(new DefaultComboBoxModel(new String[] {"School1", "School2", "School3", "School4", "School5"}));
		School.setBounds(94, 42, 104, 22);
		frame.getContentPane().add(School);
		
		JLabel description = new JLabel("");
		description.setBounds(10, 93, 326, 27);
		frame.getContentPane().add(description);
		
		JLabel Image = new JLabel("");
		Image.setBounds(10, 131, 326, 130);
		frame.getContentPane().add(Image);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String firstN = FN.getText();
				String lastN = LN.getText();
				Object grade = Grade.getSelectedItem();
				Object school = School.getSelectedItem();
				description.setText(firstN + " " + lastN +  " is in grade: " + grade + " and goes to " + school);
				
				if(school == ("School1")) 
				{
					Image.setIcon(chhs);
				}
				if(school == ("School2")) 
				{
					Image.setIcon(abe);
				}
				if(school == ("School3")) 
				{
					Image.setIcon(nelson);
				}
				if(school == ("School4")) 
				{
					Image.setIcon(fowler);
				}
				if(school == ("School5")) 
				{
					Image.setIcon(pearson);
				}
			}
		});
		Submit.setBounds(271, 11, 89, 82);
		frame.getContentPane().add(Submit);
	}
}
