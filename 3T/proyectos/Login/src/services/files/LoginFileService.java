package services.files;

import java.io.IOException;

import models.User;

public class LoginFileService {
	public void saveCredentials(User user) {
		try {
			FileService file = new FileService("credentials.secret");
			String[] content = { user.getUsername(), user.getPassword()};
			file.writeFile(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public User readCredentials() {
		try {
			FileService file = new FileService("credentials.secret");
			if(!file.exists()) return null;
			String[] credentials = file.readFile();
			return new User(credentials[0], credentials[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
