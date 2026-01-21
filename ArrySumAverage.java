import java.util.Scanner;
public class ArrySumAverage{
    public static void main(String args[]){
    int arr[]=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int i;
    for(i=0;i<arr.length;i++){
    System.out.println("Enter Element Index of" +i+" :  ");
    arr[i]=sc.nextInt();
    sum=sum+arr[i];
    }
    float avg=sum/(float)(arr.length);
    System.out.println("Output of the Array ");
    for(i=0;i<arr.length;i++){
    System.out.println("Element of "+i+" Index "+arr[i]);
    }
    System.out.println("Sum is : "+sum);
    System.out.println("Average is : "+avg);
    }
}