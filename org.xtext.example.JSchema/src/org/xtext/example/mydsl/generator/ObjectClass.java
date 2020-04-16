package org.xtext.example.mydsl.generator;
import java.util.ArrayList;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;

public class ObjectClass{
	String name;
	ArrayList<MainObject> includedMainObjects;
	ArrayList<PrimitiveObject> includedPrimitiveObjects;
	boolean isRoot;
	
	public ObjectClass(String name, boolean isRoot){
		includedMainObjects = new ArrayList<MainObject>();
		includedPrimitiveObjects = new ArrayList<PrimitiveObject>();
		this.name = name;
		this.isRoot = isRoot;
	}

	public void addMainObject(MainObject obj) {
		includedMainObjects.add(obj);
	}
	
	public void addPrimitiveObject(PrimitiveObject primObj) {
		includedPrimitiveObjects.add(primObj);
	}
	
	public ArrayList<MainObject> getMainObjects() {
		return this.includedMainObjects;
	}
	
	public ArrayList<PrimitiveObject> getPrimitiveObjects(){
		return this.includedPrimitiveObjects;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(MainObject anotherObject) {  
	       if (this == anotherObject) {  
	           return true;  
	       } else {
	    	   return false;
	       }
	}
	
	public String getObjectJSchemaString() {
		StringBuilder string = new StringBuilder();
		if (isRoot == true) {
			string.append("\"$id\":\"" + this.name + ",\n");
		} else {
			string.append("\"" + this.name + "\":{");
		}
	
		
		
		string.append( "\"type\":\"object\",\n"
						+ "");
		
		return string.toString();
	}

}
