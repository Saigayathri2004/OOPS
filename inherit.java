import java.util.*;
class employee
{
	int empId,salary;
	String empName,empAdd;
	employee(int empId,String empName,int salary,String empAdd)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.empAdd=empAdd;
	}
}
class teacher extends employee
{
	String dept,sub;
	teacher(int empId,String empName,int salary,String empAdd,String dept,String sub)
	{
		super(empId,empName,salary,empAdd);
		this.dept=dept;
		this.sub=sub;
	}
	void display()
	{
		System.out.println(" employee id is "+empId);
		System.out.println(" employee name is "+empName);
		System.out.println(" employee salary is "+salary);
		System.out.println(" employee address is "+empAdd);
		System.out.println(" employee department is "+dept);
		System.out.println(" employee subject is "+sub);
	}
}
class inherit
{
	public static void main(String args[])
	{
		Scanner op=new Scanner(System.in);
		Scanner op1=new Scanner(System.in);
		int empId,salary;
		String empName,empAdd;	
		String dept,sub;
		System.out.println("Enter the number of employee : ");
		int n=op.nextInt();
		teacher arr[]=new teacher[n];
		for(int i=0;i<n;i++)
		{       int a=i+1; 
			System.out.println("Enter "+ a+ " employee details :");
			System.out.println(" Enter employee id :");
			empId=op.nextInt();
			System.out.println(" Enter employee name :");
			empName=op1.nextLine();
			System.out.println(" Enter empoyee salary :");
			salary=op.nextInt();
			System.out.println(" Enter empoyee Address:");
			empAdd=op1.nextLine();
			System.out.println(" Enter empoyee department:");
			dept=op1.nextLine();
			System.out.println(" Enter empoyee subject:");
			sub=op1.nextLine();
			arr[i]=new teacher(empId,empName,salary,empAdd,dept,sub);
		}
		
		boolean flag=false;
		System.out.println(" Enter the id of any employe to search");
		int eid=op.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i].empId==eid)
			{
				arr[i].display();
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("ID not found");
		}
	}
}
	
	
