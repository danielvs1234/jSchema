/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.jSchema.Model
import org.xtext.example.mydsl.jSchema.PrimitiveObject
import org.xtext.example.mydsl.jSchema.MainObject
import org.xtext.example.mydsl.jSchema.Property
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import java.util.ArrayList
import org.xtext.example.mydsl.jSchema.hasProperties
import org.xtext.example.mydsl.generator.ObjectClass

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JSchemaGenerator extends AbstractGenerator {
	
	  @Inject extension IQualifiedNameProvider
	  ArrayList<PrimitiveObject> primitiveObjectList;
	  ArrayList<MainObject>	mainObjectList;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			primitiveObjectList = new ArrayList<PrimitiveObject>()
			mainObjectList = new ArrayList<MainObject>()
			
			val abstractObjects = resource.allContents.filter(Model).next
			val primitiveObjects = resource.allContents.filter(PrimitiveObject)
			
			for (primObj : resource.allContents.toIterable.filter(PrimitiveObject)){
				compilePrimitiveObject(primObj)
			}
			System.out.println(primitiveObjectList.size())
			
			for (obj : resource.allContents.toIterable.filter(MainObject)){
				mainObjectList.add(obj)
				var bool = "false"
				var rootBool = "false"
				if(checkIfObjectContainsOtherObjects(obj) == true){
					bool = "true"
				}
				if(obj.root != null){
					rootBool = "true"
				}
				System.out.println("Contains other objects: " + bool + "  " +
				obj.objectName.toString() + " PropertyListSize= " + getProperties(obj).size() + " isRoot: " + rootBool)
			}
			
			for (MainObject obj : mainObjectList){
				compileObject(obj)
			}
			
			
			
			
	}
			
	def compileObject(MainObject obj){
		var boolean isRoot = false
		if (obj.root !== null)
		val ObjectClass object = new Object
		if(checkIfObjectContainsOtherObjects(obj) == true){
			val ArrayList<String> includeList = new ArrayList<String>()
			for(String str : obj.includeObjects.objectID){
				includeList.add(str)
			}
		
		}
		
	}
	
	def compilePrimitiveObject(PrimitiveObject obj){
		primitiveObjectList.add(obj)
	}
	
	def checkIfObjectContainsOtherObjects(MainObject obj){
		if(obj.includeObjects !== null){
			return true
		}else{
			return false
		}
		
	}
	
	def ArrayList<hasProperties> getProperties(MainObject obj){
		val ArrayList<hasProperties> propertyList = new ArrayList<hasProperties>();
		for(hasProperties e : obj.properties){
			propertyList.add(e);
		}
		return propertyList
	}
	
	
	def stringBuilder(String string){
		
	}
	
	
			
	
}
