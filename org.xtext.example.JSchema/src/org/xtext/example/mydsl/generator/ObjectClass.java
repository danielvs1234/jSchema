package org.xtext.example.mydsl.generator;
import java.util.ArrayList;

import org.xtext.example.mydsl.jSchema.AbstractObject;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.Property;

public class ObjectClass{
	String name;
	ArrayList<ObjectClass> includedMainObjects;
	ArrayList<PrimitiveObjectClass> includedPrimitiveObjects;
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


	public void addMainObject(ObjectClass obj) {
		includedMainObjects.add(obj);
	}
	
	public void addPrimitiveObject(PrimitiveObjectClass primObj) {
		includedPrimitiveObjects.add(primObj);
	}
	
	public void addHasPrimObj(PrimitiveObjectClass primObj) {
		hasPrimtiveObjectPropertiesList.add(primObj);
	}
	
	public void addHasMainObj(ObjectClass mainObj) {
		hasMainObjectPropertiesList.add(mainObj);
	}
	
	public ArrayList<ObjectClass> getMainObjects() {
		return this.includedMainObjects;
	}
	
	public ArrayList<PrimitiveObjectClass> getPrimitiveObjects(){
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
			if(hasPrimtiveObjectPropertiesList.size() > 0) {
				string.append(",\n");
			}
				
		}
		if (hasPrimtiveObjectPropertiesList.size () > 0) {
			string.append("\"properties\":{\n");
			for(PrimitiveObjectClass primObject : hasPrimtiveObjectPropertiesList) {
				string.append(primObject.getPrimitiveObjectString());
			}
			
			if(includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0) {
				string.append(",\n");
			}
		}
		
		if(includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0) {
			string.append("\"allOf\":[\n");
			
			
		
		if(includedMainObjects.size() > 0) {
			for(int i=0 ; i < includedMainObjects.size() ; i++) {
				ObjectClass mainObj = includedMainObjects.get(i);
				string.append("{\n");
				string.append("\"properties\":{\n");
				string.append(mainObj.getObjectJSchemaString());
				if(i+1 <= includedMainObjects.size()) {
					string.append(",\n");
				}
			}
			if(includedPrimitiveObjects.size() > 0) {
				string.append(",\n");
			}
		}
		if(includedPrimitiveObjects.size() > 0) {
			for(int i=0 ; i < includedPrimitiveObjects.size(); i++) {
				PrimitiveObjectClass primObj = includedPrimitiveObjects.get(i);
				string.append("{\n");
				string.append("\"properties\":{\n");
				string.append(primObj.getPrimitiveObjectString());
				if(i+1 <= includedPrimitiveObjects.size()) {
					string.append(",\n");
				}
			}
		}
		
		string.append("]\n");
		}
		
		string.append("}");
		return string.toString();
	}

}
