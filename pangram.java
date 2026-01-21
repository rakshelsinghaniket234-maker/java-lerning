
/*
Q1. Remove Leading Zeros From String in Java?
Example:

Input : 00000123569
Output: 123569
*/

//Q2. Check if a given string is Pangram in Java?

import java.util.Scanner;
class pangram{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements : ");
String el=sc.nextLine();
int count=0;

for(char c='a';c<='z';c++){
String x=c+"";
if(el.indexOf(x)>=0){

count++;
}

else{
break;
}

}
if(count==26){

System.out.println("it is pangram");
return ;

}

else{
System.out.println("it is not a pangram");
}



}}