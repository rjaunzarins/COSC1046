package PreLab9;

import java.util.Scanner;
import java.util.Random;

public class PreLab9 {

	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int size = keyb.nextInt();
		int[] array = getArray(size);
		printArray(array);
		keyb.close();

	}

	/**
	 * getArray method
	 * @param size The number of elements in array
	 * @return The array of the specified size
	 */
	public static int[] getArray(int size)
	{
		Random rand = new Random();
		int[] array = new int[size];
		
		for ( int i = 0; i < size; i++ )
			array[i] = rand.nextInt(100) + 1;
		
		return array;
	}
	
	/**
	 * sum method
	 * @param array The array
	 * @return The sum of all elements
	 */
	public static int sum(int[] array)
	{
		int sum = 0;
		
		for ( int i = 0; i < array.length; i++ )
			sum += array[i];
		
		return sum;
	}
	
	/**
	 * printArray method
	 * @param array The array
	 */
	public static void printArray(int[] array )
	{
		System.out.println("Contents of the array: ");
		
		for ( int i = 0; i < array.length; i++ )
			System.out.print(array[i] + " ");
		
		System.out.println("\nSum of all elements is " + sum(array));
	}
	
}

