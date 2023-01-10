/**
 * 
 */
package iotest;

import java.util.Scanner;

/**
 * @author LAP-7
 *
 */
public class ReverseString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to reverse it : ");
        String string= scanner.next();

        reverString(string);

    }
    public static String reverString(String string) {
        if (string==null) {
            return null;
        }
        for (int i=string.length()-1;i>=0;i--) {
            System.out.print(string.charAt(i));
        }
        return string;
    }
}
