public class ArrayPassingMethod{

  public static void main(String[]args){
   int[] x= {55,66,36,78};
   System.out.println(x[2]);
   change(x);
   System.out.println(x[2]);


}

 public static void change(int[]x){
  x[2] = 90;

  }
}