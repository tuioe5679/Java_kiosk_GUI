package user_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class UserMainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMainPage window = new UserMainPage();
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
	public UserMainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 900,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 204));
		panel.setBounds(0, 0, 884, 40);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fall in Coffee");
		lblNewLabel.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(400, 10, 166, 20);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 39, 884, 33);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("³ª´®½ºÄù¾îOTF", Font.PLAIN, 15));
		btnNewButton.setBackground(SystemColor.text);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("³ª´®½ºÄù¾îOTF", Font.PLAIN, 15));
		btnNewButton_1.setBackground(SystemColor.text);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("³ª´®½ºÄù¾îOTF", Font.PLAIN, 15));
		btnNewButton_2.setBackground(SystemColor.text);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("³ª´®½ºÄù¾îOTF", Font.PLAIN, 15));
		btnNewButton_3.setBackground(SystemColor.text);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 83, 862, 470);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 10, 10));
		
		JButton btnNewButton_4 = new JButton("New button\r\n");
		btnNewButton_4.setBackground(SystemColor.text);
		btnNewButton_4.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBackground(SystemColor.text);
		btnNewButton_1_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBackground(SystemColor.text);
		btnNewButton_2_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBackground(SystemColor.text);
		btnNewButton_3_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBackground(SystemColor.text);
		btnNewButton_5.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBackground(SystemColor.text);
		btnNewButton_1_2.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("New button");
		btnNewButton_2_2.setBackground(SystemColor.text);
		btnNewButton_2_2.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("New button");
		btnNewButton_3_2.setBackground(SystemColor.text);
		btnNewButton_3_2.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_3_2);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBackground(SystemColor.text);
		btnNewButton_6.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_2_2_1 = new JButton("New button");
		btnNewButton_2_2_1.setBackground(SystemColor.text);
		btnNewButton_2_2_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_3_2_1 = new JButton("New button");
		btnNewButton_3_2_1.setBackground(SystemColor.text);
		btnNewButton_3_2_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_6_1 = new JButton("New button");
		btnNewButton_6_1.setBackground(SystemColor.text);
		btnNewButton_6_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		panel_2.add(btnNewButton_6_1);
	}
}
