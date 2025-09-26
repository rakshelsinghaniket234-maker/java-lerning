//WAP to rad studnt information from the user and print it on Screen

import java.util.Scanner;
public class InformationStudent{

      public static void main(String[]args){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter roll no :");
           int r = sc.nextInt();

           System.out.println("enter name: ");
           String n = sc.nextLine();

           System.out.println(" enter perctanges: ");
           double p = sc.nextDouble();

            System.out.println("enter enoll: ");
            String en = sc.next();

            System.out.println("enter age");
            int a = sc.nextInt();

            System.out.println("enter grade: "); 
            char g = sc.next().charAt(0);
            
  
           System.out.println("enter roll: "+r);
           System.out.println("enter name: "+n);
           System.out.println("enter perctange: "+p);
           System.out.println("enter enoll: "+en);
           System.out.println("enter age: "+a);
           System.out.println("enter grade: "+g);



           

      }

}