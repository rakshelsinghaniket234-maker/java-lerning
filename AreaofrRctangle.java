// write a program area of perameter 

import java.util.Scanner;
public class AreaofrRctangle{
      public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int l,b,ar,pr;
      l = sc.nextInt();

      b = sc.nextInt();

      ar = l*b;
      pr = 2*(l+b);
      System.out.println("Area : " +ar);
      System.out.println("perameter : " +pr);

     

}

}