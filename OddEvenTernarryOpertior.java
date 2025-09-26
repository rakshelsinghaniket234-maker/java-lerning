// print odd even terrnary operator
import java.util.Scanner;

public class 	OddEvenTernarryOpertior{
    
     public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter number");

           int n = sc.nextInt();
           String r= n%2==0 ? "even number" : "odd number" ; 

           System.out.println(r);
                       
      
      }


}