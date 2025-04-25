package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.User;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class LoggedView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public LoggedView(User user) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenido "+user.getUsername()+"!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(109, 81, 215, 14);
		contentPane.add(lblNewLabel);
		setVisible(true);
	}

}
