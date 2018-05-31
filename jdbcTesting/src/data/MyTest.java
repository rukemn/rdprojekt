package data;

import java.sql.*;
import java.util.ArrayList;

import java.util.Map;

import bdo.Column;
import bdo.Table;


public class MyTest {

	public static void wayne(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" of type ");
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
		    ResultSet pk; //primary key
		    ResultSet exportedKeys;
		    ResultSet importedKeys; //
		    ArrayList<String> all_types = new ArrayList<String>();
			for(Table t : userTables) {
				
				col = dbMeta.getColumns(null, null,t.getTableName(), null);
				pk = dbMeta.getPrimaryKeys(null, null, t.tableName);
				exportedKeys = dbMeta.getExportedKeys(null, null, t.tableName);
				importedKeys =dbMeta.getImportedKeys(null, null, t.tableName);
				
				System.out.println(t.getTableName()+ "\n" + "-------------------");
				
				while (col.next()) {
					Column column = new Column();
					
					column.setColName(col.getString("COLUMN_NAME"));
					column.setColType(col.getString("TYPE_NAME"));
					
//					if(!all_types.contains(col.getString("TYPE_NAME"))) {
//						all_types.add(col.getString("TYPE_NAME"));
					
					if(col.getString("IS_NULLABLE").contentEquals("NO")) {
			    		column.setColNullable(false);
			    	}else {
			    		column.setColNullable(true);
			    	}
					
					
					
					System.out.print("column " +col.getString("COLUMN_NAME"));
					System.out.print(" of type " +col.getString("TYPE_NAME"));

			    	if(col.getString("IS_NULLABLE").contentEquals("NO")) {
			    		System.out.print(" NOT NULL");
			    		//System.out.println(columnDescriptor);
			    	}
			    	System.out.println("");
			    	t.addColumn(column);
			    	
			    }
				
				while(pk.next()) {//must be one result!
					System.out.println("Primary KeyColumn: " + pk.getString(4));
					t.setPrimarykey(pk.getString(4));
					
				}
				
				while(exportedKeys.next()) {
					//System.out.println("Exported "+ exportedKeys.getString(3)+" to table " + exportedKeys.getString(7) + ", referenced by column: "+ exportedKeys.getString(8));
					//kinda useless
					
				}
				
				
				while(importedKeys.next()) {
					//System.out.println("Imported "+ importedKeys.getString(8)+" from table " + importedKeys.getString(7)+ " |  referencingPK: "+ importedKeys.getString(3) + "." + importedKeys.getString(4));
					t.setImportedKeys(importedKeys.getString(8), importedKeys.getString(3)+ "." + importedKeys.getString(4) );
					
				}
				Map<String,String> imports = t.getImportedKeys();
				for(Map.Entry<String, String> i : imports.entrySet()) {
					System.out.println("COLUMN " + i.getKey() + " REFERENCES " + i.getValue());
				}
				
				System.out.println("++++++++++++\n");
				
			}
//			for(String i : all_types) {
//				System.out.println(i);
//			}
		    
		     
		    conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		System.out.println("testing");
		try {
			String DB_URL = "jdbc:oracle:thin:@localhost:1521:dbvm02";
			String USER = "s6rukemn";
			String PASS = "1234";
			
			Connection oracleConn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("testing");
			
		}catch(Exception e) {
			System.out.println("failed Oracle Connection");
			e.printStackTrace();
			//test
			
		}
		
		
		
		
		
		
	}

}
 