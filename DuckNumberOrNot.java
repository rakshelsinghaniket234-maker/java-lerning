/*
wap java check given number is  duck number using for loop
duck = 1230
not duck = 1234
*/

import java.util.Scanner;
public class DuckNumberOrNot{

        public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("enter number");

                int n = sc.nextInt();

                int count= 0;

                for(;n!=0;){

                 int r = n%10;

                 if(r==0){

                  count++;

                 }  

                  n = n/10; 

           }

               if(count>=1){

                           System.out.println("this number is duck");

               }   


                   else{

                            System.out.println("this number is not duck");

                  }                                


        }


}