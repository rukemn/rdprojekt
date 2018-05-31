package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	private Connection oracleConnection;
	private Connection postgresConnection;
	
	public Connection getPostgresConnection() {
		return postgresConnection;
	}
	
	public Connection getOracleConnection() {
		return oracleConnection;
	}
	private void establishPostgresConnection(String user, String pw) {
		try {
			//Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver(new org.postgresql.Driver());
		}catch(Exception e){
		}
		
		try {
			String DB_URL = "jdbc:postgresql://localhost:5433/imdb";
			String USER = "imdbuser";
			String PASS = "eicklerSS18";
			
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			this.postgresConnection = conn;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("postgres connection failed");
		}
		
	}
	
	private void establishOracleConnection(String user, String pw) {
		try {
			//Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver(new org.postgresql.Driver());
		}catch(Exception e){
		}
		
		try {
			String DB_URL = "jdbc:oracle:thin:@localhost:1521:dbvm02";
			String USER = "s6rukemn";
			String PASS = "1234";
			
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			this.oracleConnection = conn;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Oracle connection failed");
		}
		
	}
}
