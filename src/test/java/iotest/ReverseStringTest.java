/**
 * 
 */
package iotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 ***Acceptance Criteria:**

1. Implement a method that takes a string as argument and returns a reversed value as a string.
2. [Using TDD] The method should be able to:
   1. Take null as an argument.
   2. Take an empty string as as argument.
   3. Take a string with only a single character.
 *
 */
class ReverseStringTest {

    /**
     * Test method for {@link iotest.ReverseString#reverString(java.lang.String)}.
     */
    @Test
    @DisplayName("Tests 1")
    //Tests a Null Argument
    void testCase1() 
    {
        String nullString= null;
        assertEquals(nullString, ReverseString.reverString(null));
    }
    @Test
    @DisplayName("Tests 2")
    void testCase2() {
        String empty = " ";
        assertEquals(empty, ReverseString.reverString(" "));
    }
    @Test
    @DisplayName("Tests 3")
    void testCase3() {
        String character = "A";
        assertEquals(character, ReverseString.reverString(character));
    }

}

