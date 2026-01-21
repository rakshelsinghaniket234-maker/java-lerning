class Student{
   
      public  String name;

      public Student (){

             System.out.println("this is default constuctor");

      } 


         public Student (String name){

                this();//call current class default constotor

                this.name = name;

                System.out.println("this is parametrized constuctor");

         }


           public void show(){

                   System.out.println("name"+name);

           }

             public void display(){

                    this.show();//call current class method

             }


               public static void main(String[]args){

                      Student s = new Student("aniket");

                      s.display();
 
               }

}