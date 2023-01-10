/**
 * 
 */
package iotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * **Acceptance Criteria:**

1. Implement a method that takes a string and tells if it contains the right amount of opening and closing parenthesis, braces and brackets.
2. [Using TDD] The method should be able to:
   1. Take null  as an arguments.
   2. Take an empty string as an argument.
   3. Can throw an exception.
 *
 */
class CheckBalanceTest {

    /**
     * Test method for {@link iotest.CheckBalance#stack1(java.lang.String, java.util.Stack)}.
     */
    @Test
    @DisplayName(" Take null  as an arguments")
    void test1() {
        String nullString= null;
       assertThrows(NullPointerException.class, () -> CheckBalance.stack1(nullString,new Stack<Character>()));
    }
    @Test
    @DisplayName("Take an empty string as an argument")
    void test2() { 
        String emptyString = " ";
        Stack<Character> myStack= new Stack<>();
        assertEquals(true,CheckBalance.stack1(emptyString,myStack));
    }
    @Test
    @DisplayName("able to through an exception")
    // In this case its Expected to throw EmptyStackException but it didn't becouse the code handels everycase
    void test3(){
            String mString = "}";
            Stack<Character> myStack = new Stack<>();
                assertEquals(EmptyStackException.class,CheckBalance.stack1(mString, myStack));
                fail("Expected to throw EmptyStackException but it didn't");
            }
}
