import java.util.*;
class Multithread extends Thread
{
public void run()
{
System.out.println("Multiplication table of 5");
for(int i=1;i<=10;i++)
{
System.out.println("5*"+i+"="+5*i);
try{
sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class Primethread extends Thread
{
int l;

Primethread(int l){
this.l=l;
}
public void run()
{
int count=0;
System.out.println("Prime numbers are:");
for(int i=1;i<=l;i++)
{
count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
System.out.println(i);
}
try{
sleep(2000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}

}
}
class Multiply{
public static void main(String args[])
{
int n;

Multithread m=new Multithread();

Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
n=sc.nextInt();
Primethread p=new Primethread(n);
m.start();
p.start();
}
}
