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
if(price1<price2 && price1<price3)
{
System.out.println("product1 has the lowest cost");
}
else if(price2<price1&& price2<price3)
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
/*Algorithm:

    Define the Product Class:
        Create a class Product that has three attributes:
            pcode: An integer to store the product code.
            pname: A string to store the product name.
            price: A double to store the product price.

    Create a Method to Initialize Product Data:
        Define a method data(int c, String n, double p) to set the values for the product code (pcode), product name (pname), and price (price).

    Create a Method to Display Product Information:
        Define a method display() that prints the product code, product name, and price.

    Create a Static Method to Compare Prices:
        Define a static method Lowest(double price1, double price2, double price3) that takes the prices of three products as input and determines which product has the lowest price:
            If price1 is less than both price2 and price3, print "product1 has the lowest cost".
            If price2 is less than both price1 and price3, print "product2 has the lowest cost".
            Otherwise, print "product3 has the lowest cost".

    In the Main Method:
        Create three objects obj1, obj2, and obj3 of type Product.
        Call the data method on each object to set the product details.
        Print the table headers: "product code", "product name", and "price".
        Display the details of each product using the display method.
        Call the Lowest method with the prices of the three products to find out which one is the cheapest*/
