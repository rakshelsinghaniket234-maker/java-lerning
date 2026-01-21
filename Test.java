//multipal inheritance 

interface IA{

          void a();
}

    interface IB{

          void b();
    }


      interface IC extends IA,IB{

          void c();
      }

         class Test implements IC{

                  public void a(){

                          System.out.println("this is IA interface methods");

                  }


                    public void b(){

                          System.out.println("this is IB interface methods");

                  }

                
                     public void c(){

                          System.out.println("this is IC interface methods");

                     }


                      public void hello(){

                          System.out.println("this is test class own methods");

                      }

                        public static void main(String[]args){

                                IC obj = new Test();

                                obj.a();

                                obj.b();

                                obj.c();

                              Test t = new Test();

                              t.a();

                              t.b();

                              t.c();

                              t.hello();
    
                        }


         }
    