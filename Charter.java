import java.util.Scanner;
public class IfElseCharter{

     public static void main(String[]args){

             Scanner sc = new Scanner(System.in);

              System.out.println("enter any chrter");
             char n= sc.next().charAt(0);

              if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){


                        System.out.println("this is vaowel");


               }


                 else{

                      System.out.println("this is not vaowel");


                  }


     }

}