import java.util.Scanner;
public class WhileReverse{

       public static void main(String[]args){

               Scanner sc = new Scanner(System.in);

                System.out.println("Enter number");

                int n = sc.nextInt();

                int r = 0;

                while(n!=0){
                r = r*10;
 
                int  lastdigit = n%10;

                 r+= lastdigit;

                 n/=10;



                }

                  System.out.println(r);

       }


}