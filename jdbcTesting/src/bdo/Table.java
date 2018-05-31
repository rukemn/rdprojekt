package bdo;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Table {
	//private Map<String, String> columns = new HashMap<String, String>();
	

	public String tableName; 
	private String primarykey;
	
	private Map<String, String> importedKeys = new HashMap<String, String>(); // key is the name of the colum in this.table -> value is string like "table.column"
	private List<Column> columns = new ArrayList<Column>();


	public Map<String, String> getImportedKeys() {
		return importedKeys;
	}


	public void setImportedKeys(String columnName, String referencedColumn) {
		importedKeys.put(columnName, referencedColumn);
	}

	
	public String getPrimarykey() {
		return primarykey;
	}


	public void setPrimarykey(String primarykey) {
		this.primarykey = primarykey;
	}


	public void addColumn(Column cols) {
		columns.add(cols);
		
	}


	public String getTableName() {
		return tableName;
	}


	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	
	
	
}
