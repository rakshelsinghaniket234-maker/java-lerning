//write a program to convert given amount into smallest possible banks notes (amout =1388);


import java.util.Scanner;
public class SmallestBanksNotes{

     public static void main(String[]args){


           int a,n,rm;
           Scanner sc = new Scanner(System.in);


           System.out.println("Enter number");

           a = sc.nextInt();

          System.out.println("Amount is "+a);

           n = a/100;
      
           System.out.println("Amount is  100 :"+n);

           rm = a-n*100;
           n  = rm/50;
           System.out.println("Amount is 50 :"+n);
          
           rm = rm-n*50;
           n  = rm/20;
            System.out.println("Amount is 20 : "+n);

           rm = rm-n*20;
           n = rm/10;
           System.out.println("Amount is 10 :"+n);

           rm = rm-n*10;
           n  = rm/5;
           System.out.println("Amount is 5 :"+n);

           rm = rm-n*5;
           n =  rm/2;

           System.out.println("Amount is 2 :"+n);

           rm = rm-n*2;
           
           n = rm/1;
         
           System.out.println("Amount is 1 :"+n);
           System.out.println("Amount is remeaning :"+rm);
           

           




      
       }

}