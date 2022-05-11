package hw;

public class LoginDataAccess {
	
	private static LoginDataAccess instance;
	private LoginDataAccess() {
		
	}
	public static LoginDataAccess getInstance() {
		return instance;
	}	
	public boolean verifyCredentials() {
			boolean verified = false;
			if (instance == null){
				instance = new LoginDataAccess();
			}
			else
				verified = true;
				return verified;
		}
		
	}

