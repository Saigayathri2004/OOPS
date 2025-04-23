import java.util.*;
class EvenException extends Exception
{
EvenException(String s)
{
super (s);
}
}
class OddException extends Exception
{
OddException(String s)
{
super (s);
}
}
class evenoddexception
{
static void even(int n)throws EvenException
{
if(n%2==0)
{
throw new EvenException("even number");
}
}
static void odd(int n)throws OddException
{
if(n%2 != 0)
{
throw new OddException("odd number");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
try
{
even(n);
odd(n);
}
catch(EvenException e)
{
System.out.println("even");
}
catch(OddException e)
{
System.out.println("odd");
}
finally
{
System.out.println("successful!!!");
}
}
}

