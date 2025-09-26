import java.util.Scanner;
public class IfElse{
 
        public static void main(String[]args){

                       Scanner sc = new Scanner(System.in);

                       System.out.println("Enter number");
                       int a = sc.nextInt();


                        System.out.println("Enter number");
                         int b = sc.nextInt();

                        if(a<=b)
                         System.out.println("'number 1 is greater");
                          System.out.println("this is if -1");

                         if(a>=b)
                          System.out.println("'number 2 is greater");

                          System.out.println("this is if -2");
                         
                         if(a==b)
                          System.out.println("number is equal than");
                          
                       	System.out.println("this is if -3");

        }

}