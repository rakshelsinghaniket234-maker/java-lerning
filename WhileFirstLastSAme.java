//write a program to check given number is palindorome or not;
import java.util.Scanner;
public class WhileFirstLastSAme{

     public static void main(String[]args){

          Scanner sc = new Scanner(System.in);

           int n = sc.nextInt();
 
           int m = n;//m=1331;
       
           int r = 0;

           while(n!=0){

                       r = r*10;
 
                      int  lastdigit = n%10;

                       r+= lastdigit;

                       n/=10;

           }

                 if(m==r){

                        System.out.println("this is palindrome number");


        
                 }

                   else{
         

                        System.out.println("this is not palindrome number");


                   }

     }

}