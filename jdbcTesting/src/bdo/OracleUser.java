package bdo;

public class OracleUser{
	private static String username;
	private static String password;
	
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		OracleUser.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		OracleUser.password = password;
	}
	
}
