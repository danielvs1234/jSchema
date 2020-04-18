package org.xtext.example.mydsl.generator;
import java.util.ArrayList;

import org.xtext.example.mydsl.jSchema.AbstractObject;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.Property;

public class ObjectClass{
	String name;
	ArrayList<MainObject> includedMainObjects;
	ArrayList<PrimitiveObject> includedPrimitiveObjects;
	ArrayList<ObjectClass> hasMainObjectPropertiesList;
	ArrayList<PrimitiveObjectClass> hasPrimtiveObjectPropertiesList;
	
	boolean isRoot;
	MainObject mainObject;
	
	public ObjectClass(String name, boolean isRoot, MainObject obj){
		includedMainObjects = new ArrayList<>();
		includedPrimitiveObjects = new ArrayList<>();
		hasMainObjectPropertiesList = new ArrayList<>();
		hasPrimtiveObjectPropertiesList = new ArrayList<>();
		
		mainObject = obj;
		this.name = name;
		this.isRoot = isRoot;
	}


	public void addMainObject(MainObject obj) {
		includedMainObjects.add(obj);
	}
	
	public void addPrimitiveObject(PrimitiveObject primObj) {
		includedPrimitiveObjects.add(primObj);
	}
	
	public void addHasPrimObj(PrimitiveObjectClass primObj) {
		hasPrimtiveObjectPropertiesList.add(primObj);
	}
	
	public void addHasMainObj(ObjectClass mainObj) {
		hasMainObjectPropertiesList.add(mainObj);
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
			string.append("\"" + this.name + "\":{\n");
			string.append("\"$id\":\"" + this.name + ",\n");
		}
		string.append( "\"type\":\"object\",\n");
		
		if(hasMainObjectPropertiesList.size() > 0) {
			string.append("\"properties\":{\n");
			for(ObjectClass property : hasMainObjectPropertiesList) {
				string.append(property.getObjectJSchemaString());
			}
			
		}
		if (hasPrimtiveObjectPropertiesList.size () > 0) {
			for(PrimitiveObjectClass primObject : hasPrimtiveObjectPropertiesList) {
				string.append("\"properties\":{\n");
				string.append("\"" + primObject
			}
			
		}
		
		if(includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0) {
			string.append("\"properties\":{");
		}
		
		//if(mainObj.)
		
		if(includedPrimitiveObjects.size() > 0) {
			
			for(PrimitiveObject primObj : includedPrimitiveObjects) {
			//	string.append
			}
		}
		
		string.append("}");
		return string.toString();
	}

}