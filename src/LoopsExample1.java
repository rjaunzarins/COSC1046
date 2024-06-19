import java.util.Scanner;

public class LoopsExample1
{
	public static void main(String[] args)
	{
			Scanner keyb = new Scanner(System.in);
			System.out.print("Enter a value for 'N': ");
			int n = keyb.nextInt();

			// loop to control line
			for (int i = 1; i <= n; i++)
			{
				// loop to control number of spaces
				for (int j = 1; j <= n-1; j++)
					System.out.print(" ");

				// loop to control number of *
				for ( int j = 1; j <= i; j++)
					System.out.print("*");
				
				// new line
				System.out.println();
			}	
			
			keyb.close();
	}
}