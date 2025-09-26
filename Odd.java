import java.util.Scanner;
public class Odd{

        public static void main(String[]args){

                Scanner sc = new Scanner(System.in);
 
               System.out.println("Enter number");
               int a = sc.nextInt();
 
                System.out.println("Enter number");
               int b = sc.nextInt();

                System.out.println("Enter number");
               int c = sc.nextInt();

               if(a>b && a>c){
                       System.out.println("a is greatest"); 

                }
                
                   if(b>a && b>c){
                        System.out.println("b is greatest");

                   }

                       
                         if(c>a && c>b){
                                      System.out.println("c is greatest");

                         }

                        
                            if(a==b && b==c){
                                        System.out.println("all equal");

                             }

 
              
        }

}