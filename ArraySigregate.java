public class ArraySigregate {
    public static void main(String[]args){
        int[] arr = {0,0,1,1,0}; //0 0 0 1 1 aise karan hai
        for (int elem : arr) {
            System.out.print(elem+"  ");
        }
        Sigregate(arr);
        for (int elem : arr) {
            System.out.print(elem+" ");
        }
        
    }

}

public static void Sigregate(int[]arr){
    int numberZeros = 0;
    int numberOnes = 0;
    for(int num :arr){
        if(num==0){
            numberZeros++;
        }
        else{
            numberOnes++;
        }
    }  
    
    for (int i=0; i<numberZeros; i++) {
        arr[i] = 0;
    }
    for(int i = numberZeros; i<arr.length; i++){
        arr[i] = 1;
    }
}