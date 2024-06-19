package Lab9;

import java.util.Scanner;
import java.util.Random;

public class Lab9 {

	public static void main(String[] args) {

		Scanner keyb = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("How many elements in your array?: ");
		int elem = keyb.nextInt();
		
		// Create array
		int[] array = new int[elem];
		
		for ( int i = 0; i < array.length; i++ )
		{
			array[i] = rand.nextInt(101);
		}
		
		System.out.println("Your array:");
		printArray(array);
		
		
		// Reverse array
		System.out.println("\nYour array in reverse: ");
		for ( int i = array.length - 1; i >= 0; i-- )
			System.out.print(array[i] + " ");
		
		
		
		// Create shifted array
		int temp = array[0];
		for ( int i = 0; i < array.length - 1; i++)
		{
			array[i]= array[i+1];
		}
		array[array.length - 1] = temp;
		
		System.out.println("\nYour array shifted: ");
		printArray(array);
		
		
		// Print odd number indexes of shifted array
		System.out.println("\nValues at odd-numbered indicies: ");
		for ( int i = 1; i < array.length; i+=2)
			System.out.print(array[i] + " ");
		
		keyb.close();
		
	}
	
	public static void printArray(int[] array)
	{
		for ( int i = 0; i < array.length; i++ )
			System.out.print(array[i] + " ");
		
		
	}

}

