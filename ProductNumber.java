//WAP to print product of digits of agiven number
import java.util.Scanner;
public class ProductNumber{

      public static void main(String[]args){

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int product = 1;

            while(n!=0){

                       int lastdigit = n%10;

                       product*=lastdigit;
          
                        n/=10;


            }
                        System.out.println(product);


      }

}