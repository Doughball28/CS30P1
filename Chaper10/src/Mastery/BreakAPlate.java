package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon tiger = new ImageIcon("../Chaper10/src/Mastery/tiger_plush.gif");
		ImageIcon plates_all_broken = new ImageIcon("../Chaper10/src/Mastery/plates_all_broken.gif");
		ImageIcon plates = new ImageIcon("../Chaper10/src/Mastery/plates.gif");
		ImageIcon sticker = new ImageIcon("../Chaper10/src/Mastery/sticker.gif");
		ImageIcon plates_two_broken = new ImageIcon("../Chaper10/src/Mastery/plates_two_broken.gif");
		ImageIcon placeholder = new ImageIcon("../Chaper10/src/Mastery/placeholder.gif");
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 171, 46, 79);
		frame.getContentPane().add(panel);
		
		JLabel Prize = new JLabel("");
		Prize.setBounds(144, 171, 119, 79);
		frame.getContentPane().add(Prize);
		
		JLabel Plates = new JLabel("");
		Plates.setBounds(83, 11, 317, 94);
		frame.getContentPane().add(Plates);
		
		Plates.setIcon(plates);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int Break;
				
				Break = (int)(3 * Math.random() + 1);
				
				btnNewButton.setText("Play Again");
				
				if(Break == 1)
				{
					Plates.setIcon(plates_two_broken);
					Prize.setIcon(sticker);
				}
				
				if(Break == 2)
				{
					Plates.setIcon(plates_two_broken);
					Prize.setIcon(sticker);
				}
				
				if(Break == 3)
				{
					Plates.setIcon(plates_all_broken);
					Prize.setIcon(tiger);
				}
			}
		
		});
		btnNewButton.setBounds(134, 116, 129, 44);
		frame.getContentPane().add(btnNewButton);
		
	
	}
}
