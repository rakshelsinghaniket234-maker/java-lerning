/*
 Write a java Program to print sum of digits of the given number.
Enter Any Number : 123
Sum of digits :6
*/

import java.util.Scanner;
public class WhileLast{

       public static void main(String[]args){

               Scanner sc = new Scanner(System.in);

               System.out.println(" enter number");

               int n = sc.nextInt();


               
               int sum = 0;

               while(i<=n){

               int lastdigit = n%10;
             
                sum = sum+lastdigit;

                n = n/10;

                System.out.println(sum);
              



               }

            
       }

}