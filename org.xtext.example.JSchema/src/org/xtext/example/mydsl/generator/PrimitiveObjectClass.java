package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.PrimitiveProperties;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.generator.ObjectClass;


public class PrimitiveObjectClass {

	PrimitiveObject primitiveObject;
	String name;
	PrimitiveType type;
	
	String valNumber;
	String valString;
	PrimitiveProperties stringProperties;
	
	ArrayType optArrayType;
	ArrayList<Object> arrayContent;
	
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
	}
	
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType, String optValue) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
		if(primType.equals(PrimitiveType.NUMBER)) {
			this.valNumber = optValue;
		}
		if(primType.equals(PrimitiveType.STRING)) {
			this.valString = optValue;
		}
			
	}
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType, String optValue, PrimitiveProperties stringProperties) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
		if(primType.equals(PrimitiveType.STRING)) {
			this.valString = optValue;
			this.stringProperties = stringProperties;
		}
	}
	
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType, ArrayType optArrayType, ArrayList<Object> arrayContent) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
		if(primType.equals(PrimitiveType.ARRAY)) {
			
		}
		if(optArrayType != null) {
			this.optArrayType = optArrayType;
		}
		if(arrayContent.size() > 0) {
			this.arrayContent = arrayContent;
		}
	}
	
			
	
	
	
	public void compileArray(ArrayType arrayType) {
		
	}
	
	
	public String getPrimitiveObjectString() {
		StringBuilder string = new StringBuilder();
		
		if(type.equals(PrimitiveType.STRING)){
			
			string.append("\"" + valString + "\":{\n");
			string.append("\"$id\":\"" + valString + "\",\n");
			if(stringProperties == null) {
			string.append("\"type\":\"string\"\n");
			}
			else if(stringProperties != null) {
				string.append("\"type\":\"string\",\n");
				if(stringProperties.getStringLenght() != null) {
					String[] tmp = stringProperties.getStringLenght().split("-");
					String min = tmp[0].toString();
					String max = tmp[1].toString();
					
					string.append("\"minlength\":" + min + ",\n");
					if(stringProperties.getPatternString() != null || stringProperties.getStringFormat() != null) {
						string.append("\"maxlength\":" + max + ",\n");
					} else {
						string.append("\"maxlength\":" + max + "\n");
					}
					
				}
				if(stringProperties.getPatternString() != null) {
					
					if(stringProperties.getStringFormat() != null) {
						string.append("\"pattern\":\"" + stringProperties.getPatternString() + "\",\n");
					} else {
						string.append("\"pattern\":\"" + stringProperties.getPatternString() + "\"\n");
					}
					
				}
				if(stringProperties.getStringFormat() != null) {
					string.append("\"format\":\"" + stringProperties.getStringFormat().toString() + "\"\n");
				}
				
			}
				string.append("\n}");
		}
		
		else if(type.equals(PrimitiveType.NUMBER)) {
			if(valNumber != null) {
				string.append("{\n");
				string.append("\"type\":\"number\",\n");
				string.append("\"value\":\"" + valNumber + "\"\n");
			} else {
				string.append("\"type\":\"number\"\n");
			}
			string.append("}");
		}
		
		else if(type.equals(PrimitiveType.ARRAY)) {
			string.append("\"" + this.name + "\":{\n");
			string.append("\"type\":\"array\",\n");
			string.append("\"$id\":\"" + this.name + "\",\n");
			
			if((arrayContent != null && arrayContent.size() > 0) || optArrayType != null) {
				string.append("\"items\":[\n");
				
				if(optArrayType != null) {
					string.append("{\n");
					string.append("\"type\":\"" + ("\"") + primitiveObject.getType().getArray().getArrayType() + "\"");
					string.append("}\n");
					string.append("]\n");
					string.append("}");
					
					return string.toString();
				} else if(arrayContent.size() > 0) {
					string.append("{\n");
					
					for(int i = 0 ; i < arrayContent.size() ; i++) {
						Object e = arrayContent.get(i);
						if(e instanceof ObjectClass) {
							string.append(((ObjectClass) e).getObjectJSchemaString());
						} else if (e instanceof PrimitiveObjectClass) {
							string.append(((PrimitiveObjectClass) e).getPrimitiveObjectString());
						}
						if(i+1 <= arrayContent.size()) {
							string.append(",\n");
						} else {
							string.append("\n");
						}
					}
					
					string.append("}\n");
					string.append("]\n");
					string.append("}");
					
				}
				
			}
		}
	
		return string.toString();
	}
}