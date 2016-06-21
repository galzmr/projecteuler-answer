/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem5;

/**
 *
 * @author galzmr
 */
public class App {
    
    public static void main(String[] args){
       int smallest_number = 1;
       
       while(!isDivisible(smallest_number, 20)){
           smallest_number += 1;
       }
       
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + smallest_number);
    }
    
    public static boolean isDivisible(int num, int max_divisible){
        int last_divisible = 0;
        
        for(int i=1; i <= max_divisible; i++){
            if(num % i == 0){
               last_divisible = i; 
            } else {
                break;
            }
        }
        
        return last_divisible == max_divisible;
    }
    
}
