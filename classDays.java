
import java.util.Scanner;
public class classDays{
       
        public static void main(String[]args){

               Scanner sc = new Scanner(System.in);

               int d = sc.nextInt();
               System.out.println("enter day");

               int y = d/365;
               
               int rm = d-y*365;
               
               
               System.out.println("enter of year:"+y);


               int m = rm/30;            
               System.out.println("enter of month:"+m);

               rm = rm-m*30;
                System.out.println("enter of day:"+rm);


                

         
      
           

       }

}