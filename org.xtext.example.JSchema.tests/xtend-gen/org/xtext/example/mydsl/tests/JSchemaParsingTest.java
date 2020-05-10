/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import java.security.SecureRandom;
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
    final Consumer<String> _function = (String a) -> {
      try {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("String \"");
        _builder.append(a);
        _builder.append("\"");
        Assertions.assertTrue(this.parseHelper.parse(_builder).eResource().getErrors().isEmpty());
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    this.qt().<String>forAll(this.strings().allPossible().ofLengthBetween(0, 1000)).checkAssert(_function);
  }
  
  @Test
  public void checkArrayThings() {
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
