package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemesterAvg {

	private JFrame frame; 
	private JTextField Tf1;
	private JTextField Tf2;
	private JTextField Tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
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
		
		JLabel Label1 = new JLabel("Enter first average");
		Label1.setBounds(29, 29, 131, 26);
		frame.getContentPane().add(Label1);
		
		Tf1 = new JTextField();
		Tf1.setBounds(170, 23, 189, 39);
		frame.getContentPane().add(Tf1);
		Tf1.setColumns(10);
		
		JLabel Label2 = new JLabel("Enter second average");
		Label2.setBounds(29, 80, 131, 26);
		frame.getContentPane().add(Label2);
		
		JLabel Label3 = new JLabel("Enter third average");
		Label3.setBounds(29, 130, 131, 26);
		frame.getContentPane().add(Label3);
		
		Tf2 = new JTextField();
		Tf2.setColumns(10);
		Tf2.setBounds(170, 74, 189, 39);
		frame.getContentPane().add(Tf2);
		
		JLabel Display = new JLabel("");
		Display.setBounds(186, 186, 203, 47);
		frame.getContentPane().add(Display);
		
		Tf3 = new JTextField();
		Tf3.setColumns(10);
		Tf3.setBounds(170, 124, 189, 39);
		frame.getContentPane().add(Tf3);
		
		
		
		JButton Enter = new JButton("Enter");
		Enter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Double Avg;
				
				String L1 = Tf1.getText();
				String L2 = Tf2.getText();
				String L3 = Tf3.getText();
				Avg = (Double.parseDouble(L1) + Double.parseDouble(L2) + Double.parseDouble(L3))/3;
				Display.setText(Double.toString(Avg));
			}
		});
		Enter.setBounds(29, 186, 131, 47);
		frame.getContentPane().add(Enter);
		
		
	}
}
