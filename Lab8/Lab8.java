package Lab8;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);

		
		System.out.print("Enter side A: ");
		int sideA = keyb.nextInt();
		
		System.out.print("Enter side B: ");
		int sideB = keyb.nextInt();
		
		System.out.print("Enter side C: ");
		int sideC = keyb.nextInt();
		
		double semiPerimeter = getSemiPerimeter(sideA, sideB, sideC);
		double area = getArea(semiPerimeter, sideA, sideB, sideC);
		
		System.out.println("The semi-perimeter is: " + semiPerimeter);
		System.out.println("The area is " + area + " sq. units");
		keyb.close();
	}
	
	/**
	 * getSemiPerimeter method
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * @return The semi-perimeter
	 */
	public static double getSemiPerimeter( int sideA, int sideB, int sideC )
	{
		return (double) (sideA + sideB + sideC) / 2;
	}
	
	/**
	 * getArea method
	 * @return The area
	 */
	public static double getArea( double s, int sideA, int sideB, int sideC )
	{
		return (double) Math.sqrt(s * (s - sideA)*(s-sideB)*(s-sideC));
	}

}

