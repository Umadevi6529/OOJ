import java.util.Scanner;
class Gen<T,V>
{
	T ob1;
	V ob2;
	Gen(T a,V b)
	{
		ob1=a;
		ob2=b;
	}
	T getob1()
	{
		return ob1;
	}
	V getob2()
	{
		return ob2;
	}
	void showType()
	{
		System.out.println("Value of T is"+ob1.getClass().getName());
		System.out.println("Value of T is"+ob2.getClass().getName());
	}
}

class GenDemo
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a String:");
			String s = sc.next();
			
			System.out.println("Enter a Integer number:");
			int i = sc.nextInt();
			
			Gen<String,Integer> iob;
			iob = new Gen<String,Integer> (s,i);
			String x=iob.getob1();
			System.out.println("Value of Object 1: " +x);
			int y = iob.getob2();
			System.out.println("Value of Object 1: " +y);
			System.out.println();
			iob.showType();
			
			System.out.println("Enter a String:");
			String st = sc.next();
			
			System.out.println("Enter a Double value:");
			Double d = sc.nextDouble();
			
			Gen<String,Double> iob1;
			iob1 = new Gen<String,Double> (st,d);
			String n=iob1.getob1();
			System.out.println("Value of Object 2: " +n);
			double m=iob1.getob2();
			System.out.println("Value of Object 2: " +m);
			System.out.println();
			iob1.showType();
		}
}