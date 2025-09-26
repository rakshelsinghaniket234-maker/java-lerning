
import java.util.Scanner;
public class EmolopyInformation{

      public static void main(String[]args){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter name :");
           String n = sc.next();

           
           
           System.out.println(" enter basic salary: ");
           int s = sc.nextInt();



            System.out.println(" enter departmeant name: ");
            int dn = sc.nextInt();



            System.out.println("enter job: ");
            String job = sc.next();


            int hra = salary*20/100;
            da = salary*10/100;
            ta = salary*10/100;

            int totalincentive = (hra+da+ta);
             
            
  
           System.out.println("enter name: "+n);
           System.out.println("enter salary: "+s);
           System.out.println("enter departmeant name: "+dn);
           System.out.println("enter job: "+job);
           
           System.out.println("enter total incentive: "+ totalincentive);

                      


           

      }

}