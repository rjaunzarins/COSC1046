package Lab5;

import java.util.Scanner;
import java.io.*;

public class Lab5 {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("abcd.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		
		File file = new File("abcd.txt");
		Scanner inFile = new Scanner(file);
		
		Scanner keyb = new Scanner(System.in);
		
		String output = "null";
		
		while (inFile.hasNext())
		{
			String input = inFile.nextLine(); 
			System.out.println(input);
		}

		while (!output.equals("exit"))
		{
			System.out.println("Enter text to append to file: ");
			output = keyb.nextLine();
			pw.println(output);	
			
		}
		
		pw.close();	
		inFile.close();
		keyb.close();
	}
}
