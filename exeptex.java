import java.util.*;
class exeptex
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter two nos");
a=sc.nextInt();
b=sc.nextInt();
try{
int div=a/b;
System.out.println(div);
} catch (Exception e) {
System.out.println("error ");
} finally {
System.out.println("the ! 'try catch' is finished.");
}
}
}
