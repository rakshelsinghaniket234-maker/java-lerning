//default access specifier 
/*
 class Point{

       int x;

       int y;

}


   class Test{

         public static void main(String[]args){

              Point p1 = new Point();

              System.out.println(p1.x);

              System.out.println(p1.y);   

         }

   }
*/

//write a program java to implement encasulation usin student class


class Studentss {
private String enroll;
private int sid;
private int p;
private int c;
private int m;
private int h;
private int e;
private String course;
private String branch;
private String name;

public String getEnroll(){
return enroll;
}
public void setEnroll(String en){
enroll=en;
}

public int getSid(){
return sid;
}

public void setSid(int si){
sid=si;
}


public int getPhysics(){
return p;
}
public void setPhysics(int ph){
p=ph;
}

public int getChemistry(){
return c;
}
public void setChemistry(int ch){
c=ch;
}

public int getMath(){
return m;
}
public void setMath(int ma){
m=ma;
}

public int getHindi(){
return h;
}
public void setHindi(int hi){
h=hi;
}

public int getEnglish(){
return e;
}
public void setEnglish(int en){
e=en;
}

public String getCourse(){
return course;
}
public void setCourse(String co){
course=co;
}

public String getBranch(){
return branch;
}
public void setBranch(String br){
branch=br;
}



public String getName(){
return name;
}
public void setName(String n){
name=n;
}



public static void main(String args []){

Studentss s =new Studentss();

s.setEnroll("0132cs221018");
System.out.println("Enrollment no : "+ s.getEnroll());

s.setSid(5658);
System.out.println("Student Id : "+ s.getSid());

s.setPhysics(82);
System.out.println("Physics : "+ s.getPhysics());

s.setChemistry(93);
System.out.println("Chemistry : "+ s.getChemistry());

s.setHindi(95);
System.out.println("Hindi : "+ s.getHindi());

s.setMath(87);
System.out.println("Math : "+ s.getMath());

s.setEnglish(98);
System.out.println("English : "+ s.getEnglish());

s.setName("Aniket");
System.out.println("Name : "+ s.getName());


s.setCourse("Btech");
System.out.println("Course : "+ s.getCourse());

s.setBranch("CSE");
System.out.println("Branch : "+ s.getBranch());



}


}