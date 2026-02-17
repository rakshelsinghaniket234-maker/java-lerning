import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistA3 {
    public static void main(String[] args) {
        ArrayList<String> k1=new ArrayList<String>();
      char x;
      for(x='A';x<='Z';x++){
          k1.add(String.valueOf(x));
      }
        System.out.println(""+k1);
        ListIterator<String> ltr=k1.listIterator();
        System.out.println("Print Element of List in Forward direction ");
        while(ltr.hasNext()){
          String a=ltr.next();//read
          if(a.equals("B")){//delete
              ltr.remove();
          }
          else if(a.equals("C")){//update
              ltr.set("CCC");
          }
          else if(a.equals("D")){//add
              ltr.add("d");
                     
          }
            System.out.print("---->"+a);
        }
        System.out.println("");
        System.out.println("Print Element in Backword direction ");
        while (ltr.hasPrevious()) {
            String next = ltr.previous();
            System.out.print("\t--->"+next);
        }
        System.out.println("");
        System.out.println(""+k1);
    }
   
 
}

