package com.like.trip.util;

import java.util.Date;

public  enum  ObjectType {

	   
	
    Input("Input",String.class ), Selection("Selection", Integer.class),Id("Id",Integer.class),Time("Time",Date.class);
    
    
    
   private String name ;
   private Class  type;
    
   private ObjectType( String name , Class type ){
   	
       this.name = name ;
       this.type = type ;
   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class getType() {
		return type;
	}

	public void setType(Class type) {
		this.type = type;
	}
 
    


}
