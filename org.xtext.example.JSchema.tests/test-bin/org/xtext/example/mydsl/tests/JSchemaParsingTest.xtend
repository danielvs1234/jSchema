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
import static org.junit.Assert.assertTrue

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
		qt().forAll(
			strings().betweenCodePoints(0x0023, 0x0026).ofLengthBetween(0, 1500),
			strings().betweenCodePoints(0x0028, 0x005B).ofLengthBetween(0, 1500),
			strings().betweenCodePoints(0x005D, 0x007A).ofLengthBetween(0, 1500)
			)
			.checkAssert(a,b,c | Assertions.assertTrue((parseHelper.parse('''String "�a+b+c�"''')).eResource.errors.isEmpty))
			}
	
	
	@Test
	def void checkNumbers() {
		qt.forAll(
			integers().allPositive
		)
		.checkAssert(Integer i | Assertions.assertTrue((parseHelper.parse('''num �i�''')).eResource.errors.isEmpty))
	}
	
	@Test
	def void checkArrayWithStrings(){
		qt.forAll(
			strings().betweenCodePoints(0x0023, 0x0026).ofLengthBetween(0, 1500),
			strings().betweenCodePoints(0x0028, 0x005B).ofLengthBetween(0, 1500),
			strings().betweenCodePoints(0x005D, 0x007A).ofLengthBetween(0, 1500)
			)
		
		.checkAssert(a,b,c | Assertions.assertTrue((parseHelper.parse('''TestArrayName [String "�a+b+c�"]''')).eResource.errors.isEmpty))
	}
	
	@Test
	def void checkArrayWithNumbers(){
		qt.forAll(
			integers.allPositive
			)
			.checkAssert(i | Assertions.assertTrue((parseHelper.parse('''TestArrayName [num �i�]''')).eResource.errors.isEmpty))
	}
	
	@Test
	def void checkArrayWithStringAndNumber(){
		qt.forAll(
			integers.allPositive,
			strings().betweenCodePoints(0x0023, 0x0026).ofLengthBetween(0, 1500),
			strings().betweenCodePoints(0x0028, 0x005B).ofLengthBetween(0, 1500),
			strings().betweenCodePoints(0x005D, 0x007A).ofLengthBetween(0, 1500)
		)
		.checkAssert(i,a,b,c | Assertions.assertTrue((parseHelper.parse('''TestArrayName [String "�a+b+c�", num �i�]''')).eResource.errors.isEmpty))
	}
	
	@Test
	def void checkArrayWithName(){
		qt.forAll(
			strings().basicLatinAlphabet().ofLengthBetween(1,1500)
		)
		.checkAssert(a | Assertions.assertTrue((parseHelper.parse('''�a�[]''')).eResource.errors.isEmpty))
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
