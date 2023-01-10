/**
 * 
 */
package iotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * A utility method that takes base and exponent as input (in the form of HashMap) and returns the power (in the form of HashMap) as displayed in the problem.
[Use TDD and make sure ] the method should work even if the given two arguments are:
base: 0, exponent: 0
base: null, exponent: null
base: <any positive number>, exponent <any positive number>
 *
 */
class BaseExpoTest {

    /**
     * Test method for {@link iotest.BaseExpo#resultnum(java.util.HashMap, int, java.util.Scanner)}.
     */
    @Test
    @DisplayName("Tests 1")
    // Tests a base : 0 and expo : 0
    void testResultnumCase1() { 

        HashMap<String, Integer> powerCal = new HashMap<String, Integer>();

        int powerr=1;
        int exponent=0;
        int base=0;

        powerCal.put("expononent",  exponent);
        powerCal.put("base",base);
        powerCal.put("Result",1);

        HashMap<String , Integer> expectedOut = powerCal;

        assertEquals(expectedOut,BaseExpo.resultnum(new HashMap<String, Integer>(),powerr,exponent,base));

    }
    @Test
    @DisplayName("Tests 2")
    // base: <any positive number>, exponent <any positive number>
    void testResultnumCase3() { 
        HashMap<String, Integer> powerCal = new HashMap<String, Integer>();

        int power=1;
        int exponent=2;
        int base=2;
        
        powerCal.put("expononent",  exponent);
        powerCal.put("base",base);
        powerCal.put("Result",4);

        HashMap<String , Integer> expectedOut = powerCal;

        assertEquals(expectedOut,BaseExpo.resultnum(new HashMap<String, Integer>(),power,exponent,base));
    }
    @Test
    @DisplayName("Tests 3")
    // base: null, exponent: null
    void testResultnumCase2() { 
        int power=1;
        Integer base = null;
        Integer expo = null;

        assertThrows(NullPointerException.class, () -> BaseExpo.resultnum(new HashMap<String, Integer>(),power,expo,base));
    }

}
