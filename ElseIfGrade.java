import java.util.Scanner;
public class ElseIfGrade{
 
        public static void main(String[]args){

               Scanner sc= new Scanner(System.in);

                    int a,b,c,d,e;
              
                System.out.println("enter a");
                 
                     a = sc.nextInt();

                   
                System.out.println("enter b");
                 
                     b = sc.nextInt();
 
                System.out.println("enter c");
                 
                     c = sc.nextInt();
                    
 
                System.out.println("enter d");
                 
                     d = sc.nextInt();
 
                System.out.println("enter e");
                 
                     e = sc.nextInt();



                  if(a>=90 && a<=100){

                      System.out.println("A+");

                  
                  }

                       else if(b>=80 && b<=90){

                            System.out.println("A");


                       }

                         
                          else if(c>=70 && c<=80){

                                  System.out.println("B+");


                          }
                  
                             else if(d>=60 && d<=70){

                                      System.out.println("B");


                             }

                              
                                else if(e>=50 && e<=60){

                                       System.out.println("C+");

                                }

                                 
                                                            
                                 
                                   else{

                                          System.out.println("F");
 
                                   }



        }
        

}