package controllers;

import javax.swing.JOptionPane;

import models.User;
import services.bbdd.UserService;
import views.LoggedView;

public class LoginController {

	public boolean login(User user) {
		try {
			User userDB = new UserService().getUserByUsername(user.getUsername());
			if(userDB != null) {
				new LoggedView(userDB);
				return true;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fallo en la consulta de usuario");
		}
		JOptionPane.showMessageDialog(null, "Usuario incorrecto");
		return false;
	}
	
}
