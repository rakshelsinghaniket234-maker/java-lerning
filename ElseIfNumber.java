import java.util.Scanner;
public class ElseIfNumber{

        public static void main(String[]args){

               Scanner sc = new Scanner(System.in);
          
                 System.out.println("enter number");

                  int n = sc.nextInt();

                  if(n>=0 && n<=9){

                         System.out.println("single number");

                   }
               
                       else if(n>=10 && n<=99){
                              System.out.println("double number");


                       }
 
                           
                          else if(n>=100 && n<=999){
                              System.out.println("third number");

                          }
     
                             else if(n>=10 && n<=99){
                              System.out.println("double number");
                             
                              }

                                  else{
                                       System.out.println("other number");


                                  }

        }

}