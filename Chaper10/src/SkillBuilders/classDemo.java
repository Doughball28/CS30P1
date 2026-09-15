package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class classDemo {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classDemo window = new classDemo();
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
	public classDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 446, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Fn = new JTextField();
		Fn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{ 
				if(Fn.getText().equals("Enter your first name"))
				{
					Fn.setText("");
				}
				
			}
		});
		Fn.setText("Enter your first name");
		Fn.setBounds(0, 40, 126, 35);
		frame.getContentPane().add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(Ln.getText().equals("Enter your last name"))
				{
					Ln.setText("");
				}
			}
		
		});
		
		JLabel Display = new JLabel("");
		Display.setBounds(10, 180, 257, 54);
		frame.getContentPane().add(Display);
		
		Ln.setText("Enter your last name");
		Ln.setColumns(10);
		Ln.setBounds(141, 40, 126, 35);
		frame.getContentPane().add(Ln);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String firstN = Fn.getText();
				String lastN = Ln.getText();
				
				Display.setText(firstN + " " + lastN);
			}
		
		});
		Submit.setFont(new Font("Georgia", Font.BOLD, 22));
		Submit.setBounds(293, 40, 116, 194);
		frame.getContentPane().add(Submit);
		
		
	}
}
