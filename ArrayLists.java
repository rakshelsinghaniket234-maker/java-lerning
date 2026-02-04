import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(55);
        arr.add(45);
        arr.add(18);
        arr.add(95);
       /*  System.out.println(arr.get(2));//arr[2] =18
        arr.set(3,71);//arr[3]=71update hogya
        System.out.println(arr);*/
        
        int n = arr.size(); //arr.length
        /*for (int i=0; i<n; i++) {
            System.out.print(arr.get(i)+"  ");
           
        }*/ 
        System.out.println(arr);
        arr.remove(arr.size()-1);//remove karne ke liye
        System.out.print(arr);
        
         int i = 0,  j = arr.size()-1;//reverse ke liye
         while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
         }
         System.out.println(arr);
    }
   
}
