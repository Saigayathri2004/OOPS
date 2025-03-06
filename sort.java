
import java.util.*;
class sort
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int n;
		String temp;
		System.out.println("Enter the no of string want to insert:");
		n=s.nextInt();
	
		String[] word=new String[n];
		System.out.println("Enter the strings:");
		{
			for(int i=0;i<n;i++)
			{
				word[i]=s1.nextLine();
			}
		}
		System.out.println("\nbefore sorting:");
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(word[i]);
			}
		}
		System.out.println("after sorting:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(word[i].compareTo(word[j])>0)
				{
					temp=word[i];
					word[i]=word[j];
					word[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(word[i]);
		}
	}
}
