/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.jSchema.Model
import org.xtext.example.mydsl.jSchema.AbstractObject
import org.quicktheories.WithQuickTheories
import java.security.SecureRandom

@ExtendWith(InjectionExtension)
@InjectWith(JSchemaInjectorProvider)
class JSchemaParsingTest implements WithQuickTheories {
	@Inject
	ParseHelper<Model> parseHelper

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}

	def void addingTwoPositiveIntegers() {
		qt().forAll(integers.allPositive, integers.allPositive).check([Integer i, Integer j|i + j > 0]);
	}

	@Test
	def void checkStringThings() {
		qt().forAll(strings().allPossible.ofLengthBetween(0, 1000))
		.checkAssert(String a | Assertions.assertTrue((parseHelper.parse('''String "�a�"''')).eResource.errors.isEmpty))
	}
	
	@Test
	def void checkArrayThings() {
		
	}



	def String generateRandomString(int len) {
		val possibleChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		val rnd = new SecureRandom();

		var StringBuilder sb = new StringBuilder(len)
		for (var i = 0; i < len; i++) {
			sb.append(possibleChars.charAt(rnd.nextInt(possibleChars.length())));
		}
		
		return sb.toString();
	}
	
}
