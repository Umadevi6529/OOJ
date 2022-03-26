import java.util.*;
class Book1
{
	String name;
	String author;
	double price;
	int num_pages;
	

	
	Book1(String n,String a,double p,int np)
	{
		name=n;
		author=a;
		price=p;
		num_pages=np;
	}
	public void get()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name and author of the book: ");
		name=s.next();
		author=s.next();
		
		System.out.println("Enter the price of the book: ");
		price=s.nextDouble();
		
		System.out.println("Enter the number of pages: ");
		num_pages=s.nextInt();
	}
	
	public String toString()
	{
		return  name + "\n" + author + "\n" + price +"\n" + num_pages;
		
	}
	

}
public class Book 

{

	public static void main(String[] args) 
	{
		Book1 obj = new Book1("OOJ","Balaguruswamy",299.89,200);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Books:");
		int n= sc.nextInt();
		Book b[] = new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Book();
			System.out.println("Enter the details of Book: " +(i+1));
			obj.get();
			System.out.println("Details of the book..."+(i+1));
			System.out.println(obj.toString());
		}
		

		
	}

}
