import java.util.Scanner;
class Pgm1
{
	String name,usn;
	int n;
	double marks[];
	double sgpa;
	void accept()
	{
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter name and usn :");
		 name=sc.next();
		 usn=sc.next();
		
		 System.out.println("Enter the number of Subjects:");
		 n=sc.nextInt();
		
		 marks=new double[n];
		 for(int i=0;i<n;i++)
		 {
		  System.out.println("Enter scores of subject:"+ (i+1));
		  marks[i]=sc.nextDouble();
		 }
	}
	void calc()
	{
		for(int i=0;i<n;i++)
		{
			sgpa=sgpa+marks[i];
		}
		sgpa=sgpa/n;
	}

	void display()
	{
		System.out.println("Name:\t\t"+name);
		System.out.println("USN:\t\t"+usn);
		System.out.print("Marks:\t\t");
		for(int i=0;i<n;i++)
		{
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("SGPA is :\t"+sgpa);
	}
}
class Program2
{
	public static void main(String args[])
	{
		
			Pgm1 ob = new Pgm1();
			ob.accept();
			ob.calc();
			ob.display();
	
	}
}



