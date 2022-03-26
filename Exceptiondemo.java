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
			return "Son's Age cannot be Zero!!";
		else
			return "Son's age is more than father's age";
	}
}
class Father
{
	int ag;
	Scanner sc= new Scanner(System.in);
	void fcompute() throws FWrongage
	{
		System.out.println("Enter Father's age:");
		ag=sc.nextInt();
		if(ag<=0)
			throw new FWrongage();
		else
			System.out.println("Age of the Father:"+ag);
	}
}
class Son extends Father
{
	Scanner s = new Scanner(System.in);
	int age;

	void compute() throws SWrongage
	{
		System.out.println("Enter Son's age:");
		int age=s.nextInt();
		if(age<=0 || age>=super.ag)
		{
			throw new SWrongage(age);
		}
		else
		{
			System.out.println("Age of the Son:" +age);
		}
	}
}
class Exceptiondemo
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
			s1.compute();
		}
		catch(SWrongage w)
		{
			System.out.println(w);
		}
	}
}

		
		