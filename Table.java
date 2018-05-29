package jdbcTesting;

import java.util.Map;
import java.util.HashMap;


public class Table {
	private Map<String, String> columns = new HashMap<String, String>();
	public String tableName; 
	
	
	public void addColumn(String column_name, String column_type) {
		columns.put(column_name, column_type);
		
	}


	public String getTableName() {
		return tableName;
	}


	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	
	
	
}
