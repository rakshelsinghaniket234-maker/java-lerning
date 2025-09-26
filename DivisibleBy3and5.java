// take input divisible by 5 and 3

// &&- ka matalab dono chij hona chaiye ni else print ho jayega.


import java.util.Scanner;
public class DivisibleBy3and5{

       public static void main(String[]args){

               Scanner sc = new Scanner(System.in);

               System.out.println("Enter number");

               int n = sc.nextInt();

               if(n%5==0  && n%3==0){

                             System.out.println("the number is divisible by 5 and 3");
               }

                else{

                     System.out.println("the number is not divisible by 3and 5");
               }
               
                              
       }
} 

