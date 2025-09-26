//Ternarry  operatior 

import java.util.Scanner;

public class 	TernarryOpertior{
    
     public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter age");

           int age = sc.nextInt();
           String r = age>18 ? "eligible voting" : "not eligible voting" ; 

           System.out.println(r);
                       
      
      }


}