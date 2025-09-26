
public class LastDigit{

      public static void main(String[]args){
                   int n= 785;             
                                       
                    System.out.println("before swap digit "+n);
                  int u = n%10;
                  int t = n/10%10;
                  int h = n/100;
                    
                  String r = u+" "+t+" "+h;
                 
                   System.out.println(" "+u);
                   System.out.println(" "+t);
                   System.out.println(" "+h);
                   System.out.println(" after swap digit"+r);

      }

}