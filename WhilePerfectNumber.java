//check given no is prefect number or not perfect number

import java.util.Scanner;
public class WhilePerfectNumber{

        public static void main(String[]args){

               Scanner sc = new Scanner(System.in);

               System.out.println("enter number");

               int n = sc.nextInt();

               int i = 1;

               int sum = 0;

               while(i<n){

                   if(n%i==0){
                    sum = sum+i;
                   
                    }


                       i++;

                   }

                      if(n==sum){

                         System.out.println("perfect number");

                 }


                      else{

                         System.out.println("perfect number not");
                          

                   }


        }


}
