package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Metricconversion {

	private JFrame frame;
	private JTextField Fs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metricconversion window = new Metricconversion();
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
	public Metricconversion() {
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
		
		JLabel Display = new JLabel("");
		Display.setBounds(32, 158, 359, 50);
		frame.getContentPane().add(Display);
		
		JComboBox Metric = new JComboBox();
		Metric.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Metric.getSelectedItem().equals("1 inch - 2.54 cm"))
				{
					String n = Fs.getText();
					double Num = Double.parseDouble(n);
					double answer = Num * 2.54;
					
					Display.setText(Num + " inches converted to cm is" + answer + " cm");
				}
			}
		});
		
		
		
		Metric.setModel(new DefaultComboBoxModel(new String[] {"Click here to select", "1 inch - 2.54 cm", "1ft - 0.3048 m"}));
		Metric.setBounds(20, 11, 149, 36);
		frame.getContentPane().add(Metric);
		
		
		
		Fs = new JTextField();
		Fs.setText("Enter number here");
		Fs.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(Fs.getText().equals("Enter number here"))
				{
					Fs.setText(null);
				}
			}
		});
		Fs.setBounds(240, 42, 118, 50);
		frame.getContentPane().add(Fs);
		Fs.setColumns(10);
	}
}
