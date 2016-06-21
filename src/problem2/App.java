/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem2;

import java.util.ArrayList;

/**
 *
 * @author galzmr
 */
public class App {

    public static void main(String[] args){
        int i = 0;
        int result = 0;
        int max_value = 4000000;
        int last_value = 0;
        ArrayList my_sequence = new ArrayList();
        
        while(last_value <= max_value){
            if(i > 1){
                int total = getTotal(my_sequence.get(i - 1).toString(), my_sequence.get(i - 2).toString());
                my_sequence.add(total);
            } else {
                my_sequence.add(i + 1);
            }
            
            if(isEvenNumber(my_sequence.get(i).toString())){
               result += Integer.parseInt(my_sequence.get(i).toString());
            }
            
            last_value = Integer.parseInt(my_sequence.get(i).toString());
            
            i += 1;
        }
        
        System.out.println(result);
    }
    
    public static int getTotal(String num1, String num2){
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
    
    public static boolean isEvenNumber(String num){
        if(Integer.parseInt(num) % 2 == 0) {
            return true;
        }
        
        return false;
    }
    
}
