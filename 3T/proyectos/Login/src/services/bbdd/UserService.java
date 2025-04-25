package services.bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.User;

public class UserService {

	public User getUserByUsername(String username) throws Exception {
		ResultSet result = Database.select("SELECT * FROM users WHERE username='"+username+"'");
		try {
			if(result.next()) {
				String usernameDB = result.getString("username");
				String password = result.getString("password");
				User user = new User(usernameDB, password);
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return null;
	}

}
