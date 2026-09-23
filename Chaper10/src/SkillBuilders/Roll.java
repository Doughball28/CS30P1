package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roll {

	private JFrame frame;
	private JLabel pip1d;
	private JLabel pip2d;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
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
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon pip1 = new ImageIcon("../Chaper10/src/SkillBuilders/die1.gif");
		ImageIcon pip2 = new ImageIcon("../Chaper10/src/SkillBuilders/die2.gif");
		ImageIcon pip3 = new ImageIcon("../Chaper10/src/SkillBuilders/die3.gif");
		ImageIcon pip4 = new ImageIcon("../Chaper10/src/SkillBuilders/die4.gif");
		ImageIcon pip5 = new ImageIcon("../Chaper10/src/SkillBuilders/die5.gif");
		ImageIcon pip6 = new ImageIcon("../Chaper10/src/SkillBuilders/die6.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(69, 160, 272, 96);
		frame.getContentPane().add(panel);
		
		JLabel pip1d;
		pip1d = new JLabel("");
		pip1d.setBounds(69, 44, 123, 117);
		frame.getContentPane().add(pip1d);
		
		JLabel pip2d;
		pip2d = new JLabel("");
		pip2d.setBounds(202, 44, 123, 117);
		frame.getContentPane().add(pip2d);
		
		JButton roll = new JButton("Roll Die");
		roll.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					pip1d.setIcon(pip1);
					
				}
				if(newRoll == 2)
				{
					pip1d.setIcon(pip2);
					
				}
				if(newRoll == 3)
				{
					pip1d.setIcon(pip3);
					
				}
				if(newRoll == 4)
				{
					pip1d.setIcon(pip4);
					
				}
				if(newRoll == 5)
				{
					pip1d.setIcon(pip5);
					
				}
				if(newRoll == 6)
				{
					pip1d.setIcon(pip6);
					
				}
				
				newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1)
				{
					pip2d.setIcon(pip1);
					
				}
				if(newRoll2 == 2)
				{
					pip2d.setIcon(pip2);
					
				}
				if(newRoll2 == 3)
				{
					pip2d.setIcon(pip3);
					
				}
				if(newRoll2 == 4)
				{
					pip2d.setIcon(pip4);
					
				}
				if(newRoll2 == 5)
				{
					pip2d.setIcon(pip5);
					
				}
				if(newRoll2 == 6)
				{
					pip2d.setIcon(pip6);
					
				}
			}
		});
		roll.setBounds(162, 0, 89, 45);
		frame.getContentPane().add(roll);
		

	}
}
