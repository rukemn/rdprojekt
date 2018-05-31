package bdo;

public class Column {
	private String colName;
    private String colType;
    private Integer colPrecision;
    private Integer colScale;
    private Boolean colNullable;
    
    
	public String getColName() {
		return colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public String getColType() {
		return colType;
	}
	public void setColType(String colType) {
		this.colType = colType;
	}
	public Integer getColPrecision() {
		return colPrecision;
	}
	public void setColPrecision(Integer colPrecision) {
		this.colPrecision = colPrecision;
	}
	public Integer getColScale() {
		return colScale;
	}
	public void setColScale(Integer colScale) {
		this.colScale = colScale;
	}
	public Boolean getColNullable() {
		return colNullable;
	}
	public void setColNullable(Boolean nullablility) {
		this.colNullable = nullablility;
	}
    
    

}
