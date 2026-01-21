import java.util.Scanner;
class Rectangle{

      int l;

      int b;

      void acceptData(){

           Scanner sc = new Scanner(System.out);

           System.out.println("enter length");
           l = sc.nextInt();

           System.out.println("enter breath");
           b = sc.nextInt();
     }

           void showData(){

                System.out.println("enter length"+l);

                System.out.println("enter breath"+b);


           }
 
           void getArea(){

                System.out.println("area"+(l*b));

           }
 

                void getPira(){

                System.out.println("pirameter"+2*(l+b));

                }

                   public static void main(String[]args){

                          Rectangle r1 = new Rectangle();

                          r1.acceptData();

                          r1.showData();

                          r1.getArea();
      
                          r1.getPira();





                   }

           

      

}