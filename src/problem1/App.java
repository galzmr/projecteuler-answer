/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem1;

/**
 *
 * @author galzmr
 */
public class App {
    
    public static void main(String[] args) {
        int number = 1000;
        int result = 0;
        for(int i=1; i < number; i++){
            if(isMultiple(i)){ // check apakah bilangan dapat dibagi 3 atau 5
                result += i;
            }
        }
        
        System.out.println(result);
        
    }
    
    public static boolean isMultiple(int num){
        if(num % 3 == 0 || num % 5 == 0){
            return true;
        }
        
        return false;
    }
    
}
