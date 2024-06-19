package Lab6;

import java.util.Scanner;

public class Lab6
{
	public static void main (String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		System.out.print("Enter the values for a, b, and c of the equation ax^2+bx+c=0: ");
		int a = keyb.nextInt();
		int b = keyb.nextInt();
		int c = keyb.nextInt();
		
		if (a != 0)
		{
			determinant(a, b, c);
			quadraticRoots(a, b, c);
		}
		
		keyb.close();
		System.out.println("Done");

	}

	public static void determinant(int a, int b, int c)
	{
		if (b*b - 4*a*c > 0)
			System.out.println("The roots are real and different");
		else if(b*b - 4*a*c < 0)
			System.out.println("The roots are complex and different");
		else 
			System.out.println("The roots are real and equal");
	}

	public static void quadraticRoots(int a, int b, int c)
	{
		double r1 = root1(a, b, c);
		double r2 = root2(a, b, c);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
	}

	public static double root1(int a, int b, int c)
	{
		double r1 = (-1*b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/ 2*a;
		return r1;
	}

	public static double root2(int a, int b, int c)
	{
		double r2 = (-1*b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/ 2*a;
		return r2;
	}
}