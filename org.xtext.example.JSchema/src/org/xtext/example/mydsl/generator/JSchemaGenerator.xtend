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
import org.xtext.example.mydsl.jSchema.AbstractObject
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import java.util.ArrayList
import org.xtext.example.mydsl.generator.ObjectClass
import org.xtext.example.mydsl.jSchema.PrimitiveProperties
import org.xtext.example.mydsl.jSchema.FormatTypes
import org.xtext.example.mydsl.jSchema.Extends

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JSchemaGenerator extends AbstractGenerator {
	
	  @Inject extension IQualifiedNameProvider
	  ArrayList<PrimitiveObject> primitiveObjectList;
	  ArrayList<MainObject>	mainObjectList;
	  ArrayList<ObjectClass> compiledMainObjects;
	  ArrayList<PrimitiveObjectClass> compiledPrimitiveObjects;
	  FileController fileController;
	  JsonFormatter jsonFormatter;
	  
	  //Edit for writing file to custom directory

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			val model = resource.allContents.filter(Model).next
			jsonFormatter = new JsonFormatter();
			constructSchema(model, fsa);
			System.out.println("Amount of primitive objects found: " + primitiveObjectList.size())
			}

	def constructSchema(Model rootModel,IFileSystemAccess2 fsa){
		var counter=0;
		fsa.generateFile("newGenFile.json", 
			'''
			{
				���Implement scoping for includes/excludes, meaning when a mainobjects has inherits i.e includes or extends it should check for other objects. Watch video, be fast, time is of the essence���
				�FOR mod: rootModel.abstractObject�
					�IF mod instanceof MainObject�
						�System.out.println("Rootmodel objectSize: " + rootModel.abstractObject.size + "counter: "+counter)�
						�generateMainObject(mod, rootModel.abstractObject.size == counter++)�
					�ENDIF�
					�IF mod instanceof PrimitiveObject�
						�generatePrimitiveObject(mod, rootModel.abstractObject.size == counter++)�
					�ENDIF�
				�ENDFOR�
			}
			'''
		)
	}

	def generatePrimitiveStringObject(PrimitiveObject primitiveObject, String objName){
		return'''
		"�objName�" : {
		"type": "string"
		
		�FOR prop: primitiveObject.primitiveProperties�
			�IF prop.stringFormat !== FormatTypes.DEFAULT�
				,
				"format": "�prop.stringFormat.getName.toString�"
			�ENDIF�
			�IF prop.stringLength !== null�
				,
				"minLength": �prop.stringLength.split("-").get(0)�,
				"maxLength": �prop.stringLength.split("-").get(1)�
			�ENDIF�
			�IF prop.patternString !== null�
				,
				"pattern": "�prop.patternString�"
			�ENDIF�
		�ENDFOR�
		'''
	}
	
	def generateExtendsObjects(MainObject model){
		var counter= 0;
		'''
		{
			"allOf:" [
				{
					�IF (model.inherits instanceof Extends) && !((model.inherits as Extends).extends).empty�
						�val extensions = (model.inherits as Extends).extends�
						�FOR extended : extensions�
							�IF extended instanceof PrimitiveObject�
								�IF extended.type.name !== null�
									�generateStringPrimitiveObject(extended, extensions.size == counter++)�
								�ELSEIF extended.type.array !== null�
									�generatePrimitiveArrayObject(extended, extensions.size == counter++)�
								�ELSEIF extended.type.number !== null�
									�generatePrimitiveNumberObject(extended, extensions.size == counter++)�
								�ENDIF�
							�ELSEIF extended instanceof MainObject�
								�generateMainObject(model, extensions.size == counter++)�
							�ENDIF�
						�ENDFOR�
					�ENDIF�
				}
			]
		}
		'''
	}
	
	def generatePrimitiveArrayObject(PrimitiveObject primitiveObject, boolean isLast){
		'''
		
		'''
	}
	
	def generatePrimitiveNumberObject(PrimitiveObject primitiveObject, boolean isLast){
		'''
			
		'''
	}
	
	def generateStringPrimitiveObject(PrimitiveObject mod, boolean isLast){
		'''
		"$id": "�mod.type.name�",
		"type": "string"
			�IF !mod.primitiveProperties.empty�
				{
				�FOR prop: mod.primitiveProperties�
					�IF prop.stringFormat !== FormatTypes.DEFAULT�
						,
						"format": "�prop.stringFormat.getName.toString�"
					�ENDIF�
					�IF prop.stringLength !== null�
						,
						"minLength": �prop.stringLength.split("-").get(0)�,
						"maxLength": �prop.stringLength.split("-").get(1)�
					�ENDIF�
					�IF prop.patternString !== null�
						,
						"pattern": "�prop.patternString�"
					�ENDIF�
				�ENDFOR�
				}
			�ELSEIF !mod.primitiveProperties.empty && !isLast�
			,
			�ENDIF�
		�IF !isLast�
			},
		�ELSE�
			}
		�ENDIF�
		'''
	}
	
	def generateMainObject(MainObject mod, boolean isLast){
		'''�IF !mod.name.empty�
			"$id": "�mod.name�",
			"type": "object",
			�ENDIF�
			�IF !mod.properties.empty�
				"properties": {
				�FOR prop: mod.properties�
					�IF prop instanceof MainObject�
						"$id": "�mod.name�",
						"type"": "object"
					�ENDIF�
					�IF prop instanceof PrimitiveObject�
						�IF prop.type.name !== null�
							�generatePrimitiveStringObject(prop, mod.name)�
						�ENDIF�
						�IF prop.type.array !== null�
							�generatePrimitiveArrayObject(prop, isLast)�
						�ENDIF�
						�IF prop.type.number !== null�
							�generatePrimitiveNumberObject(prop, isLast)�
						�ENDIF�
					�ENDIF�
				�ENDFOR�
				},
				"allOf": {
					
			�ENDIF�
			�IF !isLast�
				},
			�ELSE�
				}
			�ENDIF�
		'''
	}
	
	def generatePrimitiveObject(PrimitiveObject mod, boolean isLast){
		
		'''
		�IF mod.type.name.length > 0�
			�generateStringPrimitiveObject(mod, isLast)�
		�ELSEIF mod.type.array.name.length > 0�
			�generatePrimitiveArrayObject(mod, isLast)�
		�ELSEIF mod.type.number.number != 0 || mod.type.number.decimal != 0�
			�generatePrimitiveNumberObject(mod, isLast)�
		�ENDIF�
		'''
	}
}