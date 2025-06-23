package org.agd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyNewFeatureTest {

    @Test
    @DisplayName("doSomethingWild returns expected string for valid input")
    void doSomethingWildReturnsExpectedStringForValidInput() {
        MyNewFeature feature = new MyNewFeature();
        String result = feature.doSomethingWild("wild");
        Assertions.assertEquals("Added wildness: WILD", result);
    }

    @Test
    @DisplayName("doSomethingWild throws IllegalArgumentException for null input")
    void doSomethingWildThrowsExceptionForNullInput() {
        MyNewFeature feature = new MyNewFeature();
        Assertions.assertThrows(IllegalArgumentException.class, () -> feature.doSomethingWild(null));
    }

    @Test
    @DisplayName("doSomethingWild throws IllegalArgumentException for empty input")
    void doSomethingWildThrowsExceptionForEmptyInput() {
        MyNewFeature feature = new MyNewFeature();
        Assertions.assertThrows(IllegalArgumentException.class, () -> feature.doSomethingWild(""));
    }

    @Test
    @DisplayName("doSomethingWild throws IllegalArgumentException for input shorter than 3 characters")
    void doSomethingWildThrowsExceptionForShortInput() {
        MyNewFeature feature = new MyNewFeature();
        Assertions.assertThrows(IllegalArgumentException.class, () -> feature.doSomethingWild("ab"));
    }

    @Test
    @DisplayName("doSomethingWild returns expected string for input with exactly 3 characters")
    void doSomethingWildReturnsExpectedStringForThreeCharInput() {
        MyNewFeature feature = new MyNewFeature();
        String result = feature.doSomethingWild("abc");
        Assertions.assertEquals("Added wildness: ABC", result);
    }
}