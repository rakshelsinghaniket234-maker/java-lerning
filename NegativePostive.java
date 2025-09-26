import java.util.Scanner;

public class NegativePostive{
    
     public static void main(String[]args){
           Scanner sc = new Scanner(System.in);

           System.out.println("enter number");
           int n  = sc.nextInt();

                               
                       
           String r= n>0? "positive number" : n==0?"zero" : "negative number";
             System.out.println(r);
     
      
      }


}     
      