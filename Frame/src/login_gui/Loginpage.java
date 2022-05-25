package login_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import manager_gui.MangerPage;

import javax.swing.JButton;
import java.awt.SystemColor;

public class Loginpage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
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
	public Loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 884, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("fall in coffee");
		lblNewLabel.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 25));
		lblNewLabel.setBounds(406, 121, 160, 70);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Enter ID");
		textField.setColumns(10);
		textField.setBounds(406, 200, 164, 30);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter ID");
		textField_1.setColumns(10);
		textField_1.setBounds(406, 241, 164, 30);
		panel.add(textField_1);
		
		JLabel id_label = new JLabel("\uC544\uC774\uB514:");
		id_label.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 15));
		id_label.setBounds(337, 208, 57, 15);
		panel.add(id_label);
		
		JLabel password_label = new JLabel("\uBE44\uBC00\uBC88\uD638:");
		password_label.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 15));
		password_label.setBounds(325, 248, 69, 15);
		panel.add(password_label);
		
		JButton Login_Btn = new JButton("\uB85C\uADF8\uC778");
		Login_Btn.setBackground(SystemColor.text);
		Login_Btn.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		Login_Btn.setBounds(427, 281, 126, 30);
		Login_Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				MangerPage.main(null);;
			}
		});
		panel.add(Login_Btn);
		
		JButton UserLogin_btn = new JButton("\uC0AC\uC6A9\uC790 \uB85C\uADF8\uC778");
		UserLogin_btn.setBackground(SystemColor.text);
		UserLogin_btn.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 12));
		UserLogin_btn.setBounds(596, 201, 126, 70);
		panel.add(UserLogin_btn);
	}

}
