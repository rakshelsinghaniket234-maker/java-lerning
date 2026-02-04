 import java.util.Scanner;
public class ArrayCountPostiveNegative {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int countp = 0;
        int countn = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element at index " + i + ":");
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                countp++;
            } else if (arr[i] < 0) {
                countn++;
            }
        }

        System.out.println("Number of positive elements: " + countp);
        System.out.println("Number of negative elements: " + countn);

        sc.close();
    
}

}
