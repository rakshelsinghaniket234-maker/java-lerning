public class ArraySigregate {
 public static void main(String[] args) {
    

  int[] arr = {0, 0, 1, 1, 0, 0};
  int numberZero = 0;

  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 0) {
        int temp = arr[i];
        arr[i] = arr[numberZero];
        arr[numberZero] = temp;
        numberZero++;
    }
  }

    for (int x : arr) {
       System.out.print(x + " ");
    }
 }

}
