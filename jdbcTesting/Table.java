package jdbcTesting;

import java.util.Map;
import java.util.HashMap;


public class Table {
	private Map<String, String> columns = new HashMap<String, String>();
	private Map<String, String> importedKeys = new HashMap<String, String>(); // key is the name of the colum in this.table -> value is string like "table.column"
	



	public Map<String, String> getImportedKeys() {
		return importedKeys;
	}


	public void setImportedKeys(String columnName, String referencedColumn) {
		importedKeys.put(columnName, referencedColumn);
	}

	public String tableName; 
	private String primarykey;
	
	public String getPrimarykey() {
		return primarykey;
	}


	public void setPrimarykey(String primarykey) {
		this.primarykey = primarykey;
	}


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
