import java.util.Scanner;
class areas{
void area(int l,int b)
{int rec =l* b;
System.out.println(" area of rectangle is :" +rec);
}
void area(float r)
{
System.out.println(" area of circle is :" + 3.14*r*r);

}
void area(int s)
{
int sq=s*s;
System.out.println(" area of square is :" +sq);
}
}
class shape{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("the shapes (1.square 2.circle 3.rectangle)");
System.out.println("enter the side lenght of square");
int s= sc.nextInt();
areas a1 = new areas();
a1.area(s);
System.out.println(" enter the radius of circle :");
float r=sc.nextInt();
a1.area(r);
System.out.println(" enter the lenght and breadth of rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
a1.area(l,b);
}
}


