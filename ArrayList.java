import java.util.ArrayList;
import java.util.Collections;

class Arraylist {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();  //agr data me shirf integer hoga to interger likh denge

        al.add(10);
        al.add(2.5f);
        al.add("hello");
        al.add(true);
        al.add('A');

        // print using for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.print(  al.get(i)+",");
        }

        System.out.println();
        System.err.println("print using for each loop");

        // print using for-each loop
        for (Object x : al) {
            System.out.print( x+",");
        }
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(100);
        a2.add(90);
        a2.add(70);
        a2.add(60);
        a2.add(50);
        a2.add(40);
        a2.add(30);
        a2.add(20);
        a2.add(10);
        a2.add(5);
        //ab sorting krenge 
        Collections.sort(a2);
        //print agter sorting
        System.err.println("");//for line change
         for (Integer x : a2) {
            System.out.print( x+",");
        }
         System.err.println("");//for line change
        //ab reverse krenge
         System.err.println("print after reverse"+a2);
        System.err.println("");
        System.err.println("larget element in the c list "+Collections.max(a2));
        System.err.println("minum element in the c list "+Collections.max(a2));
        Collections.swap(a2, 0, a2.size() - 1);
        System.out.println("afterswap");

        
    }
}
