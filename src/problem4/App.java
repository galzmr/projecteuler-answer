/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author galzmr
 */
public class App {
    public static void main(String[] args){
        int inputan = 999;
        int num1 = inputan;
        int num2 = inputan;
        ArrayList palindromics = new ArrayList();
        boolean isStop = false;
        
        while(!isStop){
            if(isPalindromic(num1, num2)){
                palindromics.add(num1 * num2);
                if(num1 != 0){
                    num1 -= 1;
                } else {
                    num1 = inputan;
                    num2 -= 1;
                    
                }
            } else {
                if(num1 != 0){
                    num1 -= 1;
                } else {
                    num1 = inputan;
                    num2 -= 1;
                    
                }
            }
            
            if(num2 <= 0){
               isStop = true;
            }
        }
        
         Collections.sort(palindromics);
         
         System.out.println(palindromics.get(palindromics.size() - 1));
    }
    
    public static boolean isPalindromic(int num1, int num2){
        int result = num1 * num2;
        String str_result = parseToString(result);
        String reverse_result = new StringBuilder(str_result).reverse().toString();
        return str_result.equalsIgnoreCase(reverse_result);
    }
    
    public static String parseToString(int num){
        return String.valueOf(num);
    }
}
