import java.util.*;
class sman{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the string");
String a=sc.nextLine();
System.out.println("the length of string entered is " +a.length()); 
System.out.println("Uppercase String: " + a.toUpperCase()); 
System.out.println("Lowercase String: " + a.toLowerCase());  
System.out.println("character in 6th pos: " + a.charAt(6));
System.out.println("sub String(1-4) char: " + a.substring(1,4));
}}

