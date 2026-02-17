import java.util.Arrays;
public class BubbleSortCommanEl {
    public static void main(String[] args) {
        int[] a = {3,4,2,2,4};//
        int [] b = {3,2,2,7};//
        
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0 ,j = 0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
              System.out.print(a[i]+"  ");
              i++;
              j++;
            }  
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
    }
}
