import java.util.*;
class complex
{
int r;
int i;
complex(int r,int i)
{
this.r=r;
this.i=i;
}
void sum(complex c1,complex c2)
{
int x=c1.r+c2.r;
int y=c1.i+c2.i;
System.out.println("sum of "+x+"+"+y+"i");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first complexs no (as real+imginary)");
int r1=sc.nextInt();
int i1=sc.nextInt();
complex c1=new complex(r1,i1);
System.out.println("enter second complexs no (as real+imginary)");
int r2=sc.nextInt();
int i2=sc.nextInt();
complex c2=new complex(r2,i2);
complex c3=new complex(0,0);
c3.sum(c1,c2);
}
}

