/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem6;

import java.math.BigInteger;

/**
 *
 * @author galzmr
 */
public class App {
    public static void main(String[] args) {
        BigInteger natural_number = new BigInteger("100");
        
        
        System.out.println("Sum of the squares of the first " + natural_number + " natural numbers: " + getSumOfAllSquares(natural_number));
        System.out.println("Square of the sum: " + getSquare(getSquareOfTheSum(natural_number)));
    
        BigInteger difference = getSquare(getSquareOfTheSum(natural_number)).subtract(getSumOfAllSquares(natural_number));
        System.out.println("The difference between the sum of the squares of the first " + natural_number + " natural numbers and the square of the sum is: " + difference);
    }
    
    public static BigInteger getSquare(BigInteger val){
        return val.multiply(val);
    }
    
    public static BigInteger getSumOfAllSquares(BigInteger natural_number){
        BigInteger i = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;
        
        while(i.compareTo(natural_number) <= 0){
            result = result.add(getSquare(i));
            i = i.add(BigInteger.ONE);
        }
        
        return result;
    }
    
    public static BigInteger getSquareOfTheSum(BigInteger natural_number){
        BigInteger i = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;
        
        while(i.compareTo(natural_number) <= 0){
            result = result.add(i);
            i = i.add(BigInteger.ONE);
        }
        
        return result;
    }
    
}
