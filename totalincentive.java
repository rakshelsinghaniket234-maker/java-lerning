
import java.util.Scanner;
public class EmolopyInformation{

      public static void main(String[]args){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter name :");
           String n = sc.nextLine();

           
           
           System.out.println(" enter basic salary: ");
           float sal = sc.nextFloat();



            System.out.println(" enter departmeant name: ");
            int dn = sc.nextInt();



            System.out.println("enter job: ");
            String job = sc.nextLine();


            float hra = sal*20/100;
            float da = sal*10/100;
            float ta = sal*10/100;

            float totalincentive = hra+da+ta;
            float gs = sal+toalalincentive;
             
            
  
           System.out.println("enter name: "+n);
           System.out.println("enter salary: "+sal);
           System.out.println("enter departmeant name: "+dn);
           System.out.println("enter job: "+job);

            System.out.println("enter hra: "+hra);
            System.out.println("enter da: "+da);
            System.out.println("enter ta: "+ta);



           
           
           System.out.println("enter total incentive: "+ totalincentive);

           System.out.println("enter gross salary: "+gs);



           

      }

}