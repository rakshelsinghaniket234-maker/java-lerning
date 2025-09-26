  
import java.util.Scanner;
public class Areawithcircleinput{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int radius;
      radius =  sc.nextInt();
        System.out.print("Enter number");
        double pi = 3.1415;
        double area = pi * radius * radius ;
        System.out.println("The circle of area :"+area);
    }
}
