import java.util.*;
public class Sym{
public static void main(String args[])
{
int i,r,j;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
System.out.println("Symmetric or not\n enter the row and col no of the metrix :");
int c;
r=sc.nextInt();
c=sc.nextInt();
System.out.println("enter the metrix :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("the metrix is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}System.out.println();}
boolean isSym=true;

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{if(a[i][j]!=a[j][i])
{
isSym=false;
break;
}}if(!isSym){break;}}
if(isSym)
{
System.out.println("metrix is symmetric");
}
else
{
System.out.println("metrix is not symmetric");
}sc.close();
}
}
