package org.xtext.example.mydsl.tests;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonSchemaFactoryBuilder;
import com.github.fge.jsonschema.processors.syntax.SyntaxValidator;

public class TestUtils {

	public static boolean validateSchema(JsonNode schema) {
		
		JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
		SyntaxValidator sv = factory.getSyntaxValidator();
		return sv.schemaIsValid(schema);
	}
	
}
