import java.util.Scanner;
public class CalculaterSwitch{
    
       public static void main(String[]args){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter first number");
           int a = sc.nextInt();

           System.out.println("enter second number");
           int b= sc.nextInt();
 
           int n = sc.nextInt();


           switch(n){

             case 1:

                      System.out.println(a+b);
              break;

              case 2:
 
                      System.out.println(a-b);

               break;

              
               case 3:

                        System.out.println(a/b);
               break;

               
               case 4:

                        System.out.println(a*b);
                 break;

               
                case 5:

                        System.out.println(a%b);
                  break;

               
                  default :
                   
                         System.out.println("invalid");


                
           }

       } 

}
