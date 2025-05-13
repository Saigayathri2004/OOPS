import java.util.*;
class multithread extends Thread
{
	public void run()
	{
		System.out.println("Multiplication table of 5\n");
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 *"+i+" = "+(i*5));
		}
	}
}
class primethread implements Runnable
{
	public void run()
	{
		int n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the limit:");
		n=s.nextInt();
		System.out.println("\nprime numbers upto "+n+"\n");
		for(int i=1;i<=n;i++)
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
		}
	}
}
class Thread1
{
	public static void main(String args[])
	{
		int n;
		multithread m=new multithread();
		m.start();
		primethread ob=new primethread();
		Thread p=new Thread(ob);
		p.start();
		
	}
}
