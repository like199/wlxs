package com.like.trip.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.like.trip.mapper.AutoMapper;
import com.like.trip.mapper.ModelMapper;
import com.like.trip.model.Model;
import com.like.trip.model.ModelColumn;
import com.like.trip.model.Tripitem;
import com.like.trip.util.DbType;
import com.like.trip.util.MapObjectChange;
import com.like.trip.util.ObjectType;
import com.like.trip.util.TableGenerator;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;
 
import java.lang.Object;
import java.lang.reflect.Method;
@Service
public class ModelSqlService {

	@Autowired
	private AutoMapper autoMapper;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	 public String findTutorByIdSql(final int tutorId) throws Exception {
		 BeanGenerator bg=new BeanGenerator();
		 bg.addProperty("popular_place_str", String.class);
		
		 Object bean = bg.create();
		
		 
		 Method[] methods = bean.getClass().getDeclaredMethods();
	        for (int i = 0; i < methods.length; i++) {
	            System.out.println(methods[i].getName());
	        }
	        
		 SqlSession session=sqlSessionFactory.openSession();
	       SQL sql= new SQL() {
	            {
	                SELECT("*");
	                FROM("tripitem");
	                WHERE("id= #{tutorId}" );
	            }
	        };
	        System.out.println(sql);
	        HashMap<String, String> map=new HashMap();
	        map.put("sql", sql.toString());
	        map.put("tutorId", "1");
	        map.put("class", "com.like.trip.model.Tripitem");
	       List<Map> list= autoMapper.executeSql(map);
	        //List<com.like.trip.model.Tripitem> list=session.selectList("executeSql", map);
	        for( Map m:list) {
	        	Object item=MapObjectChange.mapToObject(m, bean.getClass());
	        	 BeanMap beanMap = BeanMap.create(item);
	        	System.out.println( beanMap.get("popular_place_str"));
	        	
	        }
	        return list.toString();
	    }
	 public String insertPersonSql() {
		  return new SQL() {{
		    INSERT_INTO("PERSON");
		    VALUES("ID, FIRST_NAME", "#{id}, #{firstName}");
		    VALUES("LAST_NAME", "#{lastName}");
		  }}.toString();
		}
	 public Model getModelById(Integer id) {
		 return modelMapper.selectByPrimaryKey(id);
	 }
	 public void createObject(Model model) {
		 BeanGenerator bg=new BeanGenerator();
		 for(ModelColumn column: model.getModelColumns()) {
			 System.out.println(column.getWxType());
			 Class columnClass=ObjectType.valueOf(column.getWxType()).getType();
			 bg.addProperty(column.getName(), columnClass);
			
		 }
		 Object bean = bg.create();
		 Method[] methods = bean.getClass().getDeclaredMethods();
	        for (int i = 0; i < methods.length; i++) {
	            System.out.println(methods[i].getName());
	       }
	        System.out.println(TableGenerator.createTableSql(model)); 
	        
		 
	 }
}
