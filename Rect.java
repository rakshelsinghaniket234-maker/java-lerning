//constructor

import java.util.Scanner;
public class Rect{

       int l;

       int b;//instance



        Rect(int x,int y){//parameter pass

             System.out.println("paramertrzied constructior is called");

             l =x;
 
             b =y;

        }

           Rect(){

                  System.out.println("default constructor is called");

                  l = 1;

                  b = 1;                  
             
           }

              void acceptData(){

                              Scanner sc = new Scanner(System.in);

                              System.out.println("enter legth");

                              l = sc.nextInt();

                              System.out.println("enter breath");

                              b = sc.nextInt();
                              

              }

                 void showData(){

                             System.out.println("enter legth"+l);

                             System.out.println("enter breath"+b);


                 }


                   public static void main(String[]args){

                                    Rect r1 = new Rect(10,20);

                                    r1.showData();

                                    Rect r2 = new Rect(55,33);

                                    r2.showData();

                                    Rect r3 = new Rect();

                                    r3.acceptData();

                                    r3.showData();

                   }
}