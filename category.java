import java.util.*;
class publisher{
	String pubname;
	String agencyname;
	publisher(String pubname,String agencyname)
	{
		this.pubname=pubname;
		this.agencyname=agencyname;	
	}
}
class book extends publisher
{
	String bookname;
	String author;
	int price;
	String type;
	book(String pubname,String agencyname,String bookname,String author,int price,String type)
	{
	super(pubname,agencyname);
	this.bookname=bookname;
	this.author=author;
	this.price=price;
	this.type=type;
	}
}
class literature extends book
{
	literature(String pubname,String agencyname,String bookname,String author,int price,String type)
	{
		super(pubname,agencyname,bookname,author,price, type);
	}
	void display(){
	System.out.println("publisher name : "+this.pubname);
	System.out.println("Agency name : "+this.agencyname);
	System.out.println("Book name : "+this.bookname);
	System.out.println("Author name : "+this.author);
	System.out.println("price : "+this.price);
	System.out.println("gener : "+this.type);
}}
class fiction extends book
{
	fiction(String pubname,String agencyname,String bookname,String author,int price,String type)
	{	
		super(pubname,agencyname,bookname,author,price, type);
	}	
	void display(){
	System.out.println("publisher name : "+this.pubname);
	System.out.println("Agency name : "+this.agencyname);
	System.out.println("Book name : "+this.bookname);
	System.out.println("Author name : "+this.author);
	System.out.println("price : "+this.price);
	System.out.println("gener : "+this.type);
       }
}
public class category
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter publisher name: ");
        String pubname = sc.nextLine();
        System.out.println("Enter agency name: ");
        String agencyname = sc.nextLine();
        System.out.println("Enter book name: ");
        String bookname = sc.nextLine();
        System.out.println("Enter author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter price of the book: ");
        int price = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter type of the book (e.g., Fiction, Non-Fiction, etc.): ");
        String type = sc.nextLine();

        literature lit = new literature(pubname, agencyname, bookname, author, price, type);
        lit.display();
    }
}















