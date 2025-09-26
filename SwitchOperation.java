import java.util.Scanner;
public class SwitchOperation{

         public static void main(String[]args){

                 Scanner sc = new Scanner(System.in);

                 System.out.println("choice");

                 int choice = sc.nextInt();

                 
                  switch(choice){

                       case 1:

                          System.out.println("enter lenth");
                         double l = sc.nextDouble();

                           
                          System.out.println("enter breath"); 
                          double b = sc.nextDouble();
            
                          double a = l*b;
                          System.out.println("area of rectangle"+a);

                      break;

                        
                         case 2:
   
                              System.out.println("enter lenth");
                              double L = sc.nextDouble();

                           
                              System.out.println("enter breath"); 
                              double B = sc.nextDouble();
                  
                              double p = 2*(L+B);
                              System.out.println("perimeter of rectangle"+p);

                        break;

                            case 3:
                                 
                                   System.out.println("enter pi value");
                                   double pi = 3.1415;


                                   System.out.println("enter radius value");
                                   double r = sc.nextDouble();
 
                                   
                                   double area = pi*r*r;
                                   System.out.println("area of circle"+area);

                         break;

                              case 4:
                  
                                       
                                   System.out.println("enter pi value");
                                   double PI = 3.1415;


                                   System.out.println("enter radius value");
                                   double R = sc.nextDouble();

                                   double c = 2*PI*R;
                                   System.out.println("circumference of circle"+c);
                             
                       break;

                                default :
                
                                    System.out.println("in valid choice");


                  }

         }

}
