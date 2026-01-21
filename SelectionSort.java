public class Inserction { 
public  static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;//=1
            for(int j=i+1;j<n;j++){//j=3
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
           
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,10,6};
        System.out.println("Print Element before Sorting ");
       
        for(int a:arr){
            System.out.print("\t"+a);
        }
        selectionSort(arr);
        System.out.println("\nPrint Element After Sorting ");
          for(int a:arr){
            System.out.print("\t"+a);
        }
          System.out.println("");
    }
}
}