// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment 11#, 11/08/19

// This program's behavior is uses a while loop
// to create a string that show the factors of 2
// in a given integer.

import java.util.Scanner;


public class HW11
{//open class
   public static void main(String[] args)
   {//open main
   
      System.out.println(showTwos(7));
      System.out.println(showTwos(18));
      System.out.println(showTwos(68));
      System.out.println(showTwos(120));
      System.out.println(showTwos(192));
      System.out.println(showTwos(8));
       
   }//end main
   
   public static String showTwos(int a)
   { //open method
   
      String factor = String.valueOf(a)+"=";
                        //convert from int to String
      while(a%2 == 0) {//loop while to add 2 to the string
         a=a/2;
         if (a!=1){
         factor = factor + "2*";
         //if a!=1 then add "2*"
         }
         else{
         factor = factor + "2";
         //if a==1 then add "2"
         }
      }  
      
      if (a!=1){
        factor=factor+String.valueOf(a);
        //add the remainder to the string
                      // convert from int to String
      }
     
      return factor;
      
   }//end method
   
}//end class