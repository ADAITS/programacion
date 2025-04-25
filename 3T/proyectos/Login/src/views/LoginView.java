package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.LoginController;
import models.User;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JCheckBox chckbxNewCheckBox;

	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(169, 195, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(85, 63, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(85, 117, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(151, 60, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 114, 154, 20);
		contentPane.add(passwordField);
		
		chckbxNewCheckBox = new JCheckBox("remember me");
		chckbxNewCheckBox.setBounds(169, 154, 159, 23);
		contentPane.add(chckbxNewCheckBox);
		setVisible(true);
		
		readCredentials();
		
		/* ACCIONES */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getPassword().toString();
				User user = new User(username, password);
				boolean checked = chckbxNewCheckBox.isSelected();
				boolean success = new LoginController().login(user, checked);
				if(success) {
					dispose();
				}
				
			}
		});
	}
	
	private void readCredentials() {
		User user = new LoginController().readCredentials();
		if(user != null) {
			textField.setText(user.getUsername());
			passwordField.setText(user.getPassword());
			chckbxNewCheckBox.setSelected(true);
		}
	}
}























