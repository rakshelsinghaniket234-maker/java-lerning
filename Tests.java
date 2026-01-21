//overloading

Class Tests{

      public void add(){

             int a,b,c;

             a = 10;

             b = 20;

             c = a+b;

             System.out.println("addition without arggument" +c);


     }

       public void add(int a, int b){

               int c;

               c = a+b;

               System.out.println("addition without two argument"+c);
  
       }


         public void add(float a,float b){

                float c;

                c = a+b;

                System.out.println("addition without two float argument" +c);


         }

           public void add(int a,float b){

                float c;

                c = a+b;

                System.out.println("addition without two float argument" +c);


         }

             public void add(float a,int b){

                float c;

                c = a+b;

                System.out.println("addition without two float argument" +c);


         }

          public static void main(String[]args){

                 Tests t = new Tests();

                 t.add(1,3);

                 t.add(23,4);
          }



}