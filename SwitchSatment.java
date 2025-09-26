import java.util.Scanner;
public class SwitchSatment{
    
       public static void main(String[]args){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter charter");
           char c = sc.next().charAt(0);


           switch(c){

             case 'a':

                      System.out.println("it is vowel");
              break;

              case 'e':
 
                      System.out.println("it is vowel");

               break;

              
               case 'i':

                        System.out.println("it is vowel");
               break;

               
               case 'o':

                        System.out.println("it is vowel");
                 break;

               
                case 'u':

                        System.out.println("it is vowel");
                  break;

               
                  default :
                   
                         System.out.println("it is not vowel");


                
           }

       } 

}
