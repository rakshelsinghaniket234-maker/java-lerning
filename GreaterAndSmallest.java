import java.util.Scanner;

public class GreaterAndSmallest{
    
     public static void main(String[]args){
           Scanner sc = new Scanner(System.in);

           System.out.println("enter number");
           int a = sc.nextInt();

           System.out.println("enter second number");
           int b = sc.nextInt();

           System.out.println("enter third number");
           int c = sc.nextInt();
                    
                       
           int  r= (a>b)? ((a>c)?a:b): ((b>c)? b:c);

             System.out.println(r);
     
      
      }


}     
      