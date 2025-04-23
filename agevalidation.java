//sample program for throw and throws
import java.util.*;
class agevalidation{
static void age(int n) throws ArithmeticException{
if(n<18)
{
throw new ArithmeticException("under aged !!!");
}
}
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("entetr ur age");
int n=sc.nextInt();
try
{
age(n);
}
catch(Exception e)
{
System.out.println("not valid age");
}
}
}
