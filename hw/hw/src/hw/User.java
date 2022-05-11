package hw;

public class User {
	
	private static User instance;
	private int id;
	private String userName;
	private String password; 
	private User() {
		// TODO Auto-generated constructor stub
	}
	private static User getInstance() {
		return instance;
		
	}

}
