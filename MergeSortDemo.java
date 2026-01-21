public class MergeSortDemo {

    static void conquer(int arr[], int si, int mid, int ei) {
        int size = ei - si + 1;//4
        int merged[] = new int[size];

        int idx1 = si;//represent left part of mid  idx1=0
        int idx2 = mid + 1;//represent right part of the mid idx2=2
        int x = 0;//represent merged array
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
//copy merged array into original Array
        for (int i = 0, j = si; i < size; i++, j++) {
            arr[j] = merged[i];
        }
    }

    static void divide(int arr[], int si, int ei) {
        // si=0   ei=3
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;  //mid=1
        divide(arr, si, mid);//for Left
        divide(arr, mid + 1, ei);//for Right
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
       
   
        int arr[] = {6, 3, 9, 5};
        int size = arr.length;
        System.out.println("Before Sorting : \n");
        for (int i = 0; i < size; i++) {
            System.out.print("\t"+ arr[i]);
        }
        divide(arr, 0, size - 1);
        //divide(arr,0,3)
        System.out.println("\nAfter  Sorting : \n");
        for (int i = 0; i < size; i++) {
            System.out.print("\t"+ arr[i]);
        }
        System.out.println("");
    }
    }