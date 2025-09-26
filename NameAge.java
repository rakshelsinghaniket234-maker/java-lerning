/*Q1.

Write a program to take as input from the user and print:
Enter Your Name: 
Enter Your Age: 21
/*


import java.util.Scanner;
public class NameAge{

        public static void main(String[]args){

                 Scanner sc = new Scanner(System.in);
                 
                  System.out.println("your name is");

                  char name = sc.next().charAt(0);

                  System.out.println("your age is");

                  int n = sc.nextInt();

                  
                  System.out.println("your name is"+name); 

                  System.out.println("your age is"+n);                 

        }

}
