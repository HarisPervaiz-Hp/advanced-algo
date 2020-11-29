
// Program to illustrate methods in java.

import java.io.*; 
  
class Methods { 
      
    int sum = 0; 
      
    public int addTwoInt(int a, int b){ 
          
        // adding two integer value. 
        sum = a + b; 
          
        //returning summation of two values. 
        return sum;  
    } 
      
 
    public static void main (String[] args) { 
      
        // creating an instance of Addition class  
        Methods add = new Methods(); 
          
        // calling addTwoInt() method to add two integer using instance created 
        // in above step. 
        int s = add.addTwoInt(1,2); 
        System.out.println("Sum of two integer values :"+ s); 
          
    } 
} 