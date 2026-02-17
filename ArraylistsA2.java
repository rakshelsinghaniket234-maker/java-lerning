
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistsA2 {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(10);
        al.add(2.5f);
        al.add(123.56);
        al.add("Hello");
        al.add(true);
        al.add('A');

        System.out.println("Print Element of the Array Using for loop : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print("===>" + al.get(i));
        }
        System.out.println("");
        System.out.println("Print Element of ArrayList Using foreach loop : ");
        for (Object x : al) {
            System.out.print("--->" + x);
        }
        System.out.println("");
       
        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(100);
        a2.add(10);
        a2.add(90);
        a2.add(20);
        a2.add(70);
        a2.add(30);
        a2.add(60);
        a2.add(40);
        a2.add(50);
       
        System.out.println("Print A2 Elements before Sorting");
        for(int y:a2){
            System.out.print("----->"+y);
        }
        System.out.println("");
       
          System.out.println("Print A2 Elements After Sorting");
          Collections.sort(a2);
              for(int y:a2){
            System.out.print("----->"+y);
        }
        System.out.println("");
        Collections.reverse(a2);
        System.out.println("Print Element of A2 in Descending Order After Sorting ");
              for(int y:a2){
            System.out.print("----->"+y);
        }
        System.out.println("");
        System.out.println("Largest Element in the List : "+Collections.max(a2));
        System.out.println("Smallest Element in the List : "+Collections.min(a2));
        System.out.println(""+a2);//[100, 90, 70, 60, 50, 40, 30, 20, 10]
        Collections.swap(a2, 0, a2.size()-1);
        System.out.println("Print After swapping : "+a2);
       
    }
}

