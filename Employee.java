//wap a java to create a employee class and perform some  operation

import java.util.Scanner;
public class Employee{

       int empno;

       String name;

       float sal;

       String job;

       int deptno;

       String hiredate;


}

      void getData(){

           Scanner sc = new Scanner(System.in);

           System.out.println("enter empno");

           empno = sc.nextInt();

           System.out.println("enter emponame");

           name = sc.nextLine();

           System.out.println("enter sal");

           sal = sc.nextFloat();

           System.out.println("enter deptno");

           deptno = sc.nextInt();

           System.out.println("enter job");

           job = sc.nextLine();

           System.out.println("enter hiredatae");

           hiredate = sc.nextLine();



      }

           void showData(){

                System.out.println("enter empno"+empno);

                System.out.println("enter emponame"+name);

                System.out.println("enter sal"+sal);

                System.out.println("enter deptno"+deptno);
            
                System.out.println("enter job"+job);

                System.out.println("enter hiredate"+hiredate);

               

          }


             float getHra(){
         
                   return sal*20/100;

             }


                 floatDA(){

                         return sal*10/100;

                 }


                     floatTA(){

                            return sal*10/100;
                    
                     }


                         float getAllIncentive(){

                               return getHra()+getDA()+floatTA();


                         }


                            float getGrossSalary(){

                                  return getAallIncentive()+sal;

                            }

                                public static void main(String[]args){

                                       Employee e = new Employee();

                                       e.getData();

                                       e.showData()

                                       System.out.println("HRA"+e.getHRA());

                                       System.out.println("DA"+e.getDA());

                                       System.out.println("TA"+e.getTA());

                                       System.out.println("HRA"+e.getHRA());

                                       System.out.println("HRA"+e.getHRA());

                                       





                                }