public class StringsChangedIndex{

      public static void main(String args[]){

             StringBuffer sb = new StringBuffer("abcabcabc");

             System.out.println(sb);

             for(int i = 0; i<sb.length(); i++){

                 char c = sb.charAt(i);

                 if(c=='a'){

                        sb.setCharAt(i,'x');

                 }

             }
             System.out.println(sb);


      }


}