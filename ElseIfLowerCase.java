import java.util.Scanner;
public class ElseIfLowerCase{

     public static void main(String[]args){

             Scanner sc = new Scanner(System.in);

              System.out.println("enter any chrter");
             char n= sc.next().charAt(0);

              if(n>='A'&& n<='Z') {
                 System.out.println("Upper case charter");


               }

                  else if(n>='a' && n<='z'){

                    System.out.println("lower case charter ");
                 
                  } 

                     
                     else if(n>='0' && n<='9'){

                           System.out.println("number");
                     
                     }

                       else{

                              System.out.println("special charter");
                          
                             }         



     }

}