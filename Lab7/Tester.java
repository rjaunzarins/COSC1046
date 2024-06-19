package Lab7;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = keyb.nextInt();
		System.out.print("Enter height: ");
		int height = keyb.nextInt();
		
		Triangle tri = new Triangle(base, height);
		System.out.printf("Hypotenuse is: %.2f\n", tri.getHypotenuse());
		System.out.printf("Area of the triangle is: %.2f\n", tri.getArea());
		System.out.printf("Perimeter of the triangle is: %.2f\n", tri.getPerimeter());
		
		keyb.close();
	}

}