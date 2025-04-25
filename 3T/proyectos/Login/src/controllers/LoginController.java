package controllers;

import javax.swing.JOptionPane;

import models.User;
import services.bbdd.UserService;
import services.files.LoginFileService;
import views.LoggedView;

public class LoginController {

	public boolean login(User user, boolean remember) {
		try {
			User userDB = new UserService().getUserByUsername(user.getUsername());
			if(userDB != null) {
				new LoggedView(userDB);
				if(remember) {
					new LoginFileService().saveCredentials(userDB);
				}
				return true;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fallo en la consulta de usuario");
		}
		JOptionPane.showMessageDialog(null, "Usuario incorrecto");
		return false;
	}

	public User readCredentials() {
		return new LoginFileService().readCredentials();
	}
	
}
