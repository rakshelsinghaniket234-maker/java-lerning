//WAP TO PRINT SUM OF DIGIT OF A GIVEN NUMBER

import java.util.Scanner;
public class SumOfDigit{

     public static void main(String[]args){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter number");

           int n = sc.nextInt();
 
           int sum = 0;

           while(n!=0){

                      int lastdigit = n%10;
                  
                      sum+=lastdigit;
                 
                      n/=10;


           }

               System.out.println(sum);

           

     }

}