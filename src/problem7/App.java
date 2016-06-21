/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem7;

/**
 *
 * @author galzmr
 */
public class App {
    public static void main(String[] args) {
        int index_prime = 10001;
        int current_index = 1;
        int number = 1;
        
        System.out.println("Prime Numbers: ");
        while(index_prime > 0){
           if(isPrime(number)){
               index_prime -= 1;
               System.out.println("Index " + current_index + ": " + (number));
               current_index += 1;
           }
           
           number += 1;
        }
        
    }
    
    public static boolean isPrime(int num){
        int divide_count = 0;
        
        for(int i=1; i <= num; i++){
           if(num % i == 0){
               divide_count += 1;
           } 
           
           if(divide_count > 2){
            return false;
           }
        }
        
        
        if(divide_count > 2){
            return false;
        }
        
        return num != 1;
    }
    
}
