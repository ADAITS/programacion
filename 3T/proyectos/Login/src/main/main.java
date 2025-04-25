package main;

import services.bbdd.Database;
import views.LoginView;

public class main {

	public static void main(String[] args) {
		try {
			Database.conectar();
			new LoginView();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
