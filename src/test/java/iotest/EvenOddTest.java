/**
 * 
 */
package iotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 *this is a test method of the evenodd method
 *
 */
class EvenOddTest {

    @Test
    void test() {
        
  
        
        // Tests the Odd num
        int [] odd = {3,5,7,9};
        HashMap <String,ArrayList<Integer>> expout = new HashMap<String,ArrayList<Integer>>();
        ArrayList<Integer> oddnumbers= new ArrayList<Integer>();
        oddnumbers.add(3);
        oddnumbers.add(5);
        oddnumbers.add(7);
        oddnumbers.add(9);
        expout.put("odd", oddnumbers);
       HashMap<String, ArrayList<Integer>> actualOut= EvenOdd.oddAndeven(odd, new ArrayList<Integer>(), new ArrayList<Integer>(), new HashMap<String, ArrayList<Integer>>());
        assertEquals(expout,actualOut);
        

      
        // Tests the even nums 
        int [] even = { 2,4,6,8};
        HashMap <String,ArrayList<Integer>> expoutput = new HashMap<String,ArrayList<Integer>>();
        ArrayList<Integer> evennumbers= new ArrayList<Integer>();
        evennumbers.add(2);
        evennumbers.add(4);
        evennumbers.add(6);
        evennumbers.add(8);
        expoutput.put("even", evennumbers);
       HashMap<String, ArrayList<Integer>> actualOutput= EvenOdd.oddAndeven(even, new ArrayList<Integer>(), new ArrayList<Integer>(), new HashMap<String, ArrayList<Integer>>());
        assertEquals(expoutput,actualOutput);
        
        // Tests the even and Odd 
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        HashMap<String, ArrayList<Integer>> expectedOutput = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        expectedOutput.put("odd", oddNumbers);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        expectedOutput.put("even", evenNumbers);
        assertEquals(expectedOutput,EvenOdd.oddAndeven( input,new ArrayList<Integer>(), new ArrayList<Integer>(), new HashMap<String, ArrayList<Integer>>()));
        
        // Tests empty array
        int [] arr= {} ;
        HashMap<String, ArrayList<Integer>> expectedout = new HashMap<String, ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> actual = EvenOdd.oddAndeven( arr,new ArrayList<Integer>(), new ArrayList<Integer>(), new HashMap<String, ArrayList<Integer>>());
        assertEquals(expectedout,actual);
        
        
 
        
        
        
        
        
        
        
    }
   

}
