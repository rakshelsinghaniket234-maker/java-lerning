//overriding

class Parent{

      public void prop(){

             System.out.println("farming land parent class method");

      }

}

        class Child extends Parent{

      public void prop(){

             System.out.println("child class method");

      }

          public static void main(String[]args){

                 Parent p = new Parent();

                 p.prop();

                 Parent p1 = new Child();

                 p1.prop();

                 Child c1 = new Child();

                 c1.prop();

          }

}