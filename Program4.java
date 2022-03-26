
abstract class Shape
{
	double a;
	double b;
	Shape(double d,double p)
	{
		a=d;
		b=p;	
	}
	Shape(double d)
	{
		a=d;
	}
	abstract double printArea();
	
}
class Triangle extends Shape
{
	Triangle(double d,double p)
	{
	super(d,p);
	}
    double printArea()
	{
		return (a*b/2);
	}
}
class Circle extends Shape
{
	Circle(double d)
	{
	super(d);
	}
	double printArea()
	{
		return (3.14*a*a);	
	}
}
class Rectangle extends Shape
{
	Rectangle(double d,double p)
	{
	super(d,p);
	}
	double printArea()
	{
		return (a*b);
	}
}
public class Program4 
{

	public static void main(String[] args) 
	{
		Shape s;
		Shape ob1 = new Triangle(6,7);
		s= ob1;
		System.out.println("Area of Triangle: " + s.printArea());
		Shape ob2 = new Circle(2);
		s = ob2;
		System.out.println("Area of Circle: " + s.printArea());
		Shape ob3 = new Rectangle(3,6);
		s = ob3;
		System.out.println("Area of Rectangle: " + s.printArea());	

	}

}



