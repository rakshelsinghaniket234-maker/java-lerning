public class BubbleSortReverse {
    

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        
            int[] arr = {5,10,9,8,7,4,0};
             int n = arr.length;
             for(int i=0; i<n-1;i++){ 
                //int swaps = 0;
                for(int j=0; j<n-1-i; j++){ 
                    if (arr[j]<arr[j+1]) { 
                        int temp = arr[j];
                         arr[j] = arr[j+1]; 
                         arr[j+1] = temp; 
                         //swaps++ //thoda sa bhi cnge hua to ++ kardenge
                        } 
                    } 
                    //if(swaps==0) break;
                }

                print(arr);
        }
       
    
    
    }

