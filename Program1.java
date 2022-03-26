import java.util.Scanner;
public class Program1
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the value of a..");
        a=sc.nextDouble();   
        System.out.println("Enter the value of b..");
        b=sc.nextDouble();    
        System.out.println("Enter the value of c..");
        c=sc.nextDouble();   
        
        double d=(b*b)-(4*a*c);    
        if(d>0)
        {
            System.out.println("Roots are real and unequal");
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are..");
            System.out.println(root1);
            System.out.println(root2);
        }
        else if(d==0)
        {
            System.out.println("The roots are real and equal.");
            double root=(-b)/(2*a);
            System.out.println("Root is "+root);
        }
        else
        {
            System.out.println("The roots are complex and different");
            System.out.println("Roots are ");
            System.out.println(-b/(2*a));
            System.out.println(Math.sqrt(-d)/(2*a));
        }
     }
}