package jdbcTesting;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import jdbcTesting.Table;


public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver(new org.postgresql.Driver());
		}catch(Exception e){
			

		}
		try {
			String DB_URL = "jdbc:postgresql://localhost:5432/imdb";
			String USER = "imdbuser";
			String PASS = "eicklerSS18";
			
			Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5433/imdb",
					"imdbuser","eicklerSS18");
			
			Statement stm = conn.createStatement();
			
			DatabaseMetaData dbMeta = conn.getMetaData();
			
			
			
			ResultSet myRs = dbMeta.getSchemas();
			
//			while(myRs.next()) {
//				System.out.println(myRs.getString(1));
//			}
			ArrayList<Table> userTables= new ArrayList<Table>();
			String[] table_types = {"TABLE"};
			ResultSet tables = dbMeta.getTables("", "", "", table_types);
		    while (tables.next()) {
		       
		        Table nt = new Table();
		        nt.setTableName(tables.getString(3));
		        userTables.add(nt);
		        
		        
		    }
		    
		    ResultSet col;
			for(Table t : userTables) {
				col = dbMeta.getColumns(null, null,t.getTableName(), null);
				System.out.println(t.getTableName()+ "\n" + "-------------------");
				while (col.next()) {
					System.out.print("column " +col.getString("COLUMN_NAME"));
			    	System.out.println(" of type " + col.getString("TYPE_NAME"));
			    	
			    	
			    	t.addColumn(col.getString("COLUMN_NAME"), col.getString("TYPE_NAME"));
			    }
				System.out.println("++++++++++++\n");
				
			}
		    
		     
		    
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		
		
		
		
		
		
	}

}
 