import java.util.Scanner;

public class 	largestnu{
    
     public static void main(String[]args){
           Scanner sc = new Scanner(System.in);

           System.out.println("enter number");
           int a = sc.nextInt();

           System.out.println("enter second number");
           int b = sc.nextInt();
                    
                       
           String r= a<b ? "gretest number"+b : "smallest number"+a ; 

             System.out.println(r);
     
      
      }


}     
      