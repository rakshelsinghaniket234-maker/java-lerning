 //write a program to print sum of two numbers

import java.util.Scanner;
public class SumOf2Number{

     public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number");

           int number1 = sc.nextInt();
           int number2 = sc.nextInt();
           int sum = number1 + number2;

           System.out.println("the sum of 2 two number is :"+sum);
     }

}
