/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.tests;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.processors.syntax.SyntaxValidator;
import com.google.inject.Inject;
import java.security.SecureRandom;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.quicktheories.WithQuickTheories;
import org.quicktheories.api.QuadConsumer;
import org.quicktheories.api.TriConsumer;
import org.xtext.example.mydsl.jSchema.Model;
import org.xtext.example.mydsl.tests.JSchemaInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(JSchemaInjectorProvider.class)
@SuppressWarnings("all")
public class JSchemaParsingTest implements WithQuickTheories {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  private IGenerator2 underTest;
  
  private JsonNode output;
  
  private static IGeneratorContext context = new GeneratorContext();
  
  public Model generateSchema() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("testobjectProp {");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("String \"testProp\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("String \"testStringProp\" with ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("length 3-5, ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("pattern \"/&\", ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("format uri;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("TestArray2 [String \"name1\", num 4]");
      _builder.newLine();
      _builder.newLine();
      _builder.append("mainTestProp root{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("Test includes \"testStringProp\", \"testobjectProp\", \"TestArray2\"{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("TestArray [String \"a\", num 1]");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return this.parseHelper.parse(_builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testModel() {
    try {
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      if (((this.generateSchema() != null) && (!this.generateSchema().eResource().getErrors().isEmpty()))) {
        Assert.assertTrue("Errors in syntax", false);
      }
      this.underTest.doGenerate(this.generateSchema().eResource(), fsa, JSchemaParsingTest.context);
      InputOutput.<Boolean>println(Boolean.valueOf(fsa.getTextFiles().containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testFile.json"))));
      CharSequence _get = fsa.getTextFiles().get((IFileSystemAccess.DEFAULT_OUTPUT + "testFile.json"));
      String _plus = ("AaaAa" + _get);
      InputOutput.<String>println(_plus);
      Assertions.assertTrue(fsa.getTextFiles().containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testFile.json")));
      Assertions.assertEquals(1, fsa.getTextFiles().size());
      CharSequence _get_1 = fsa.getTextFiles().get((IFileSystemAccess.DEFAULT_OUTPUT + "testFile.json"));
      InputOutput.<String>println(((String) _get_1));
      CharSequence _get_2 = fsa.getTextFiles().get((IFileSystemAccess.DEFAULT_OUTPUT + "testFile.json"));
      final JsonNode schema = new ObjectMapper().readTree(((String) _get_2));
      final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
      final SyntaxValidator sv = factory.getSyntaxValidator();
      final ProcessingReport pr = sv.validateSchema(schema);
      Assert.assertTrue(pr.isSuccess());
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
    final Consumer<String> _function = (String a) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(a);
        _builder.append("[]");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<String>forAll(
      this.strings().basicLatinAlphabet().ofLengthBetween(1, 1500)).checkAssert(_function);
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
