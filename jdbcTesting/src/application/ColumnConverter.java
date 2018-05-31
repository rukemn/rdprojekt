package application;

import bdo.Column;

public class ColumnConverter {
	
    public Column convertColumnPostgresOracle(Column postgresColumn) {

        Column oracleColumn = new Column();
        //all the need types for imdb are:
        //serial, int4, varchar, text
        switch (postgresColumn.getColType()) {
            case "int4":
            case "serial":
                oracleColumn.setColType("number");
                oracleColumn.setColPrecision(postgresColumn.getColPrecision());
                oracleColumn.setColScale(0);
                break;
            case "varchar":
                oracleColumn.setColType("varchar2");
                oracleColumn.setColPrecision(postgresColumn.getColPrecision());
                oracleColumn.setColScale(null);
                break;
            case "text":
                oracleColumn.setColType("clob");
                oracleColumn.setColPrecision(null);
                oracleColumn.setColScale(null);
                break;
                
                


        }

        if (!oracleColumn.getColType().isEmpty()) {
            // Typeconversion successful, add colName and nullable
            oracleColumn.setColName(postgresColumn.getColName());
            oracleColumn.setColNullable(postgresColumn.getColNullable());
            return oracleColumn;
        } else {
            // Typeconversion failed, no match
            return null;
        }
    }
}
