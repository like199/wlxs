package com.like.trip.util;

import com.like.trip.model.ModelColumn;
import com.like.trip.model.Model;

/**
 * 创建表
 * @author like
 *
 */
public class TableGenerator {


	public static String createTableSql(Model model) {
		StringBuffer sqlBuffer=new StringBuffer();
		sqlBuffer.append("CREATE TABLE "+model.getName()+" ( ");
		sqlBuffer.append("id "+DbType.valueOf("Id").getType() +" NOT NULL AUTO_INCREMENT");
		sqlBuffer.append(",create_time "+DbType.valueOf("Time").getType() );
		for(ModelColumn column:model.getModelColumns()) {
			String type=DbType.valueOf(column.getWxType()).getType();
			if(type.equals("VARCHAR")) {
				sqlBuffer.append(" , "+column.getName()+" "+type +"(255)");
			}
			else {
				sqlBuffer.append(" , "+column.getName()+" "+type +"");
			}
		}
		sqlBuffer.append(" ,PRIMARY KEY (`Id`))");
		return sqlBuffer.toString();
	}
	

}
