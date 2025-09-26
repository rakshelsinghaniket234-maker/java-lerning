// write  aprogram claculat area and circumfarance of circle

import java.util.Scanner;

public class circle{

     public static void main(String[]args){

           float r, ar , cr;

           Scanner sc = new Scanner(System.in);

           System.out.println("enter radius");

           r = sc.nextFloat();

           ar = 3.14f*r*r;
   
           cr = 2*3.14f*r ;

           System.out.println("area of circle"+ar);

           System.out.println("circumfarance of "+cr);      


    }

}