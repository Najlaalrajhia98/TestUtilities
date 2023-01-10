/**
 * 
 */
package iotest;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author LAP-7
 *
 */
public class CheckBalance {

    /**
     * Using STACK, Validate if the the expression containing
square brackets, braces and paranthesis is balanced or not.

INPUT: "{ int x= (int)(0+1); int[] arr=new arr[10];;; }"
OUTPUT: true (Meaning valid)

INPUT: "[{()}]"
OUTPUT: true (Meaning valid)

INPUT: "]{()}[
OUTPUT: false (Meaning Invalid)

INPUT: "([]("
OUTPUT: false (Meaning Invalid)

INPUT: "(arr[10})"
OUTPUT: false (Meaning Invalid)

INPUT: "[arr(10)["
OUTPUT: false (Meaning Invalid)

INPUT: "([arr{(10)}])"
OUTPUT: true (Meaning valid)
     */
    public static void main(String[] args) {
        String mString="{}";
        Stack<Character> myStack = new Stack<>();
        System.out.println(stack1(mString, myStack));
    }

    public static boolean stack1 (String mString,Stack<Character> myStack) {
        try {

            for (int i=0; i<mString.length();i++) {

                if (mString.charAt(i)== '{' || mString.charAt(i)=='['  || mString.charAt(i)=='(') 
                    myStack.push(mString.charAt(i));

                else if (mString.charAt(i)=='}'|| mString.charAt(i)==']' || mString.charAt(i)==')') 
                {
                    if (!myStack.empty()  && mString.charAt(i)=='}'&& myStack.contains('{') || !myStack.empty()&&
                            mString.charAt(i)==']'&& myStack.contains('[') || !myStack.empty()&&
                            mString.charAt(i)==')'&& myStack.contains('(') )
                        myStack.pop();
                    else {

                        return false;
                    }
                }
            } 
        } catch (EmptyStackException e) {
            e.getMessage();
        }
        if (myStack.empty()) { 
            return true;
        }
        else 
            return false;
    }
}

