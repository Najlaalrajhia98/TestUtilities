/**
 * 
 */
package iotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * **Acceptance Criteria:**

1. Implement a method that takes a string and a delimiter character as an argument and returns a reversed value as a string.
2. [Using TDD] The method should be able to:
   1. Take null for both of the arguments.
   2. Take an empty string as the first argument.
   3. Take an empty string as the second argument.
   4. Return an empty array.

 *
 */
class SplitMethodTest {

    /**
     * Test method for {@link iotest.SplitMethod#splitMethod(java.lang.String, char)}.
     */
    @Test
    @DisplayName(" Take null for both of the arguments.")
    void testSplitMethod1() {
        assertEquals(null,SplitMethod.splitMethod(null,null) );
    }
    @Test
    @DisplayName("Take an empty string as the first argument")
    void testSplitMethod2() {
        String empty=" ";
        char delimiter =',';
        ArrayList<String> expectedOut= new ArrayList<>();
        expectedOut.add(empty);
        assertEquals(expectedOut,SplitMethod.splitMethod(empty,delimiter));
    }
    @Test
    @DisplayName("Take an empty string as the second argument.")
    void testSplitMethod3() {
        String input="Reverse me if you can";
        char delimiter =' ';
        ArrayList<String> store = new ArrayList<String>();
        store.add("Reverse");
        store.add("me");
        store.add("if");
        store.add("you");
        store.add("can");
        assertEquals(store,SplitMethod.splitMethod(input,delimiter));
    }
    @Test
    @DisplayName("Return an empty array.")
    void testSplitMethod4() {
        String input="";
        char delimiter =' ';
        ArrayList<String> store = new ArrayList<String>();
        store.add(input);
        assertEquals(store,SplitMethod.splitMethod(input,delimiter));
    }
}
