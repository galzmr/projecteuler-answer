/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem3;

import java.math.BigInteger;

/**
 *
 * @author galzmr
 */
public class App {
    public static void main(String[] args){
        BigInteger val = new BigInteger("600851475143");
        BigInteger last_factor = BigInteger.ZERO;
        
        while(val.compareTo(BigInteger.ONE) == 1){
            last_factor = getFactor(val);
            val = val.divide(last_factor);
        }
        
           System.out.println("Largest prime factor: " + last_factor);
        
    }
    
    public static BigInteger getFactor(BigInteger val){
        BigInteger retval = val;
        BigInteger i = new BigInteger("2");
        
        while(i.compareTo(retval) == -1){
            if(val.mod(i).equals(BigInteger.ZERO)){
                retval = i;
                break;
            }
            
            i = i.add(BigInteger.ONE);
        }
        
        return retval;
    }
}
