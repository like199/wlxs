package com.like.trip.util;

public enum DbType {

	   
	     
		 Input("Input","VARCHAR"), Selection("Selection","INT"),Id("Id","INT"),Time("Time","DATETIME");
		    
		    
		    
		   private String name ;
		   private String  type;
		    
		   private DbType( String name , String type ){
		   	
		       this.name = name ;
		       this.type = type ;
		   }

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}
		    
	     
	 
	
}
