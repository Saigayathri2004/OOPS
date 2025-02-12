import java.util.*;
public class Product{
int pcode;
String pname;
double price;
void data(int c,String n,double p)
{pcode=c;
pname=n;
price=p;}
void display(){
System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void Lowest(double price1,double price2,double price3)
{
if(price1>price2 && price1>price3)
{
System.out.println("product1 has the lowest cost");
}
else if(price2>price1&& price2>price3)
{
System.out.println("product2 has the lowest cost");
}
else
{
System.out.println("product3 has the lowest cost");
}
}
public static void main(String args[])
{
Product obj1=new Product();
Product obj2=new Product();
Product obj3=new Product();
obj1.data(101,"pc",100.0);
obj2.data(102,"ac",180.0);
obj3.data(103,"tv",200.0);
System.out.println("product code\t\tproduct name\t\tprice");
obj1.display();
obj2.display();
obj3.display();
Lowest(obj1.price,obj2.price,obj3.price);
}}
