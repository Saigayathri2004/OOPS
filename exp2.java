import java.util.*;
class negException extends Exception{
 negException(String s){
  super(s);}
 }
class average{
 static void avge(int n) throws negException
 {
  int sum=0,av,a;
  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the nos :");
  for(int i=0;i<n;i++)
  { a=sc.nextInt();
    if(a<0)
    {
    throw new negException("negative no");
    }
    else
    {
     sum=sum+a;
     }
   }
   av=sum/n;
   System.out.println("avg of nos = "+av);
   
   }
   }
 class exp2{
 public static void main(String args[])
 {
  Scanner sc1=new Scanner(System.in);
  System.out.println("enter the limit of nos :");
  int n=sc1.nextInt();
  average a1=new average();
  
  try{
   a1.avge(n);
   }
   catch(negException s)
   {
   System.out.println("negative no");
   }
   finally{
   System.out.println("end....");
   }
   
   }
   }
 
   
   
