/**
 * 
 */
package iotest;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author LAP-7
 *
 */
public class BaseExpo {

    /**
     * @param args
     */
        public static void main(String[] args) {
            
            int power=1;
            int base=2;
            int expo=2;
            HashMap<String, Integer> baseExpo = new HashMap<String, Integer>();
            System.out.println(resultnum(baseExpo,power,expo,base));
 
        } 
        public static HashMap<String, Integer> resultnum(HashMap<String, Integer> baseExpo,int power,int expo,int base) {
            
            for (int i=0; i<expo ; i++) 
            {
                power=power*base;
                
            }
            
            baseExpo.put("base", base);
            baseExpo.put("expononent", expo);
            baseExpo.put("Result", power);
     
            return baseExpo;
            
        }
        
    }
