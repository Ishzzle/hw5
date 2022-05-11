package hw;

public class LoginBusiness {
		private static LoginBusiness instance;
		private String userName;
		private String password;
		private LoginBusiness() {
		}
		
		public static LoginBusiness getInstance() {
			return instance;
		}
		
		public boolean verifyCredentials() {
			boolean verified = false;
			if (instance == null){
				instance = new LoginBusiness();
			}
			else
				verified = true;
				return verified;
		}
}

