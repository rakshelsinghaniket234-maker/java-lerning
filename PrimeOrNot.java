
//check prime numbe or not prime number
import java.util.Scanner;
public class PrimeOrNot{

        public static void main(String[]args){

                 Scanner sc = new Scanner(System.in);

                 System.out.println("enter number");

                 int n = sc.nextInt();

                 int i = 1;

                 int count = 0;



                 while(i<=n){

                   if(n%i==0){
               
                   count++;


                    }


                       i++;

                   }

                      if(count==2){

                         System.out.println("prime number");

                 }


                      else{

                         System.out.println("prime number not");
                          

                   }


        }


}