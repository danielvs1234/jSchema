/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import java.security.SecureRandom;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.quicktheories.WithQuickTheories;
import org.quicktheories.api.Function3;
import org.quicktheories.api.QuadConsumer;
import org.quicktheories.api.TriConsumer;
import org.quicktheories.core.Gen;
import org.xtext.example.mydsl.jSchema.Model;
import org.xtext.example.mydsl.tests.JSchemaInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(JSchemaInjectorProvider.class)
@SuppressWarnings("all")
public class JSchemaParsingTest implements WithQuickTheories {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addingTwoPositiveIntegers() {
    final BiPredicate<Integer, Integer> _function = (Integer i, Integer j) -> {
      return (((i).intValue() + (j).intValue()) > 0);
    };
    this.qt().<Integer, Integer>forAll(this.integers().allPositive(), this.integers().allPositive()).check(_function);
  }
  
  @Test
  public void checkStringThings() {
    final TriConsumer<String, String, String> _function = (String a, String b, String c) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("String \"");
        _builder.append(((a + b) + c));
        _builder.append("\"");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<String, String, String>forAll(
      this.strings().betweenCodePoints(0x0023, 0x0026).ofLengthBetween(0, 1500), 
      this.strings().betweenCodePoints(0x0028, 0x005B).ofLengthBetween(0, 1500), 
      this.strings().betweenCodePoints(0x005D, 0x007A).ofLengthBetween(0, 1500)).checkAssert(_function);
  }
  
  @Test
  public void checkNumbers() {
    final Consumer<Integer> _function = (Integer i) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("num ");
        _builder.append(i);
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<Integer>forAll(
      this.integers().allPositive()).checkAssert(_function);
  }
  
  @Test
  public void checkArrayWithStrings() {
    final TriConsumer<String, String, String> _function = (String a, String b, String c) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("TestArrayName [String \"");
        _builder.append(((a + b) + c));
        _builder.append("\"]");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<String, String, String>forAll(
      this.strings().betweenCodePoints(0x0023, 0x0026).ofLengthBetween(0, 1500), 
      this.strings().betweenCodePoints(0x0028, 0x005B).ofLengthBetween(0, 1500), 
      this.strings().betweenCodePoints(0x005D, 0x007A).ofLengthBetween(0, 1500)).checkAssert(_function);
  }
  
  @Test
  public void checkArrayWithNumbers() {
    final Consumer<Integer> _function = (Integer i) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("TestArrayName [num ");
        _builder.append(i);
        _builder.append("]");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<Integer>forAll(
      this.integers().allPositive()).checkAssert(_function);
  }
  
  @Test
  public void checkArrayWithStringAndNumber() {
    final QuadConsumer<Integer, String, String, String> _function = (Integer i, String a, String b, String c) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("TestArrayName [String \"");
        _builder.append(((a + b) + c));
        _builder.append("\", num ");
        _builder.append(i);
        _builder.append("]");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<Integer, String, String, String>forAll(
      this.integers().allPositive(), 
      this.strings().betweenCodePoints(0x0023, 0x0026).ofLengthBetween(0, 1500), 
      this.strings().betweenCodePoints(0x0028, 0x005B).ofLengthBetween(0, 1500), 
      this.strings().betweenCodePoints(0x005D, 0x007A).ofLengthBetween(0, 1500)).checkAssert(_function);
  }
  
  @Test
  public void checkArrayWithName() {
    final TriConsumer<String, String, String> _function = (String a, String b, String c) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        String _replaceAll = b.replaceAll("[^a-zA-Z_0-9]", "");
        String _plus = (a + _replaceAll);
        String _replaceAll_1 = c.replaceAll("[^a-zA-Z_0-9]", "");
        String _plus_1 = (_plus + _replaceAll_1);
        _builder.append(_plus_1);
        _builder.append("[]");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<String, String, String>forAll(
      this.strings().betweenCodePoints(0x005E, 0x005E).ofLengthBetween(0, 1), 
      this.strings().betweenCodePoints(0x0041, 0x007A).ofLengthBetween(1, 1), 
      this.strings().betweenCodePoints(0x0041, 0x007A).ofLengthBetween(0, 1500)).checkAssert(_function);
  }
  
  @Test
  public void checkObjectName() {
    final Consumer<String> _function = (String a) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(a);
        _builder.append("{}");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<String>forAll(
      this.objectID()).checkAssert(_function);
  }
  
  public Gen<String> azAZ09() {
    return null;
  }
  
  public Gen<String> objectID() {
    final Function3<String, String, String, String> _function = (String string1, String string2, String string3) -> {
      return string1.concat(string2.replaceAll("/*[^a-z^A-Z^_]", "")).concat(string3.replaceAll("/*[^a-zA-Z_0-9]", ""));
    };
    return this.strings().betweenCodePoints(0x005E, 0x005E).ofLengthBetween(0, 1).<String, String, String>zip(
      this.strings().betweenCodePoints(0x0041, 0x007A).ofLengthBetween(1, 1), 
      this.strings().betweenCodePoints(0x0030, 0x007A).ofLengthBetween(0, 10), _function);
  }
  
  public Gen<String> letters() {
    final BiFunction<String, String, String> _function = (String stringOne, String stringTwo) -> {
      return stringOne.concat(stringTwo);
    };
    return this.strings().betweenCodePoints(0x0041, 0x005A).ofLengthBetween(0, 1500).<String, String>zip(
      this.strings().betweenCodePoints(0x0061, 0x007A).ofLengthBetween(0, 1500), _function);
  }
  
  public String generateRandomString(final int len) {
    final String possibleChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    final SecureRandom rnd = new SecureRandom();
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; (i < len); i++) {
      sb.append(possibleChars.charAt(rnd.nextInt(possibleChars.length())));
    }
    return sb.toString();
  }
}
