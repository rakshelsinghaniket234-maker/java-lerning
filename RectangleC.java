import java.util.Scanner;

public class RectangleC{

       float r;

       void acceptData(){

            Scanner sc = new Scanner(System.in);

            System.out.println("enter radius");

            r = sc.nextFloat();

       }


           void showData(){

                System.out.println("radius are"+r);


           }

               float getArea(){
 
                     return 3.14f*r*r;

               }

                     float getCirc(){
  
                           return 2*3.14f*r*r;


                     }


                        public static void main(String[]args){

                               circle k = new circle();

                               k.acceptData();

                               k.showData();

                               System.out.println("area of circle"+k.getArea());

                               System.out.println("area of circle"+k.getCirc());


                       }

}