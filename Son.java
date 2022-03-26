import java.util.*;
class FWrongage extends Exception
{
	public String toString()
	{
		return "Age is incorrect!! Enter the correct age";
	}
}
class SWrongage extends Exception
{
	int age;
	SWrongage(int a)
	{
		age=a;
	}
	public String toString()
	{
		if(age<=0)
			return "Age cannot be Zero!!";
		else
			return "Son's age is more than father's age";
	}
}
class Father
{
	Scanner sc= new Scanner(System.in);
	int ag;
	Father()
	{
		System.out.println("Enter Father's age:");
		int ag=sc.nextInt();
	}
	static void fcompute() throws Wrongage
	{
		if(ag<=0)
			throw new Wrongage(ag);
		else
		{
			System.out.println("Age of the Father:"+ag);
		}
	}
}
class Son extends Father
{
	Scanner s = new Scanner(System.in);
	int age;
	Son()
	{
		System.out.println("Enter Son's age:");
		int age=s.nextInt()
	}
	static void compute(int ag,int age) throws Wrongage
	{
		if(age<=0 || age>=super.ag)
			throw new Wrongage(age);
		else
		{
			System.out.println("Age of the Son:" +age);
		}
	}
}
class ExceptionDemo
{
	public static void main(String args[])
	{
		Son s1 = new Son();
		try
		{
			s1.fcompute();
		}
		catch(FWrongage w)
		{
			System.out.println(w);
		}
		try
		{
			s1.fcompute();
		}
		catch(FWrongage w)
		{
			System.out.println(w);
		}
	}
}

		
		