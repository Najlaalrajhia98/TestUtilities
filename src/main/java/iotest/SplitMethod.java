/**
 * 
 */
package iotest;

import java.util.ArrayList;

/**
 * @author LAP-7
 *
 */
public class SplitMethod {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Character delimiter = ' ';
        String input="Reverse,me,if,you,can";
        System.out.println(splitMethod(input,delimiter));
    }

    public static ArrayList<String> splitMethod(String input,Character delimiter) 
    {
        try {
            if (input==null || delimiter==null) 
                return null;
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
       
        ArrayList<String> element= new ArrayList<>();
        String subString= "";

        for (int i=0; i<input.length();i++) 
        {
            if (input.charAt(i)== delimiter) 
            {
                element.add(subString);
                subString="";
            } else 
            {
                subString=subString+input.charAt(i);

            }

        } element.add(subString);

        return element;
    }
}

