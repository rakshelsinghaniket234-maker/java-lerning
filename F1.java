//taking nothing returning nothing

import java.util.Scanner;
public class F1{

       public void add(){

              System.out.println("function is called");

              Scanner sc = new Scanner(System.in);

              System.out.println("enter number 1:");

              int n1 = sc.nextInt();

              System.out.println("enter number 2:");

              int n2 = sc.nextInt();

              int n3 = n1+n2;

          
              System.out.println("sum of two number s:"+n3);
              

       }


             public static void main (String args[]){

                    F1 m = new F1();

                    m.add();
   }
  

            }