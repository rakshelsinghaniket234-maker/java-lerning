//multipalh inharitance

class Person{

     public Person(){

            System.out.println("person class default consuctor");

     }

        public void talk(){

            System.out.println("person can speak");

       }


         public void walk(){

            System.out.println("person can walk");

     }


}

   class Teacher extends Person{

                public Teacher(){

                       System.out.println("teacher class default consutor");
            
                }

                  
                 public void teach(){

                        System.out.println("teacher teaches students");

                 }

   }

     class Professor extends Teacher{

                    public Professor(){

                            System.out.println("professor class default consutor");
       
                    }

                       public void research(){
 
                                   System.out.println("professor does reserch");

                       }


                         public static void main(String[]args){

                                Professor p = new Professor();

                                p.talk();

                                p.walk();


                                p.teach();


                                p.research();

                         }

     }