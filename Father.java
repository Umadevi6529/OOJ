import java.util.*;
class Wrongage extends Exception
{
	int age;
	Wrongage(int a)
	{
		age=a;
	} 
	public String toString()
	{
		return "Age "+age+ " is incorrect!! Enter the correct age";
	}
]
class Father
{
	int ag;
	Father(int a)
	{
		ag=a;
	}
}
class Son extends Father
{
	int age;
	Son(int ag,int a)
	{
		super(ag);
		age=a;
	}
	void compute() throws Wrongage
	{
		if(ag<=0 || age>=ag)
			throws new Wrongage(age);
		else
			System.out.println("Age of the Father:"+ag);
			System.out.println("Age of the Son:" +age);
	}
}
class Exceptiondemo 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Father's age:");
		ag=sc.nextInt();
		
		System.out.println("Enter Son's age:");
		age=sc.nectInt();
		
		Son s1 = Son(ag,a);
		try
		{
			s1.compute();
		}
		catch(Wrongage w)
		{
			System.out.println(w);
		}
	}
}
		
		