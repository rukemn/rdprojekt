package bdo;

public class PostgresUser {
	private static String username;
	private static String password;
	
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		PostgresUser.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		PostgresUser.password = password;
	}
	
}
