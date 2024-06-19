import java.util.Scanner;
import java.util.Random;

/**
 * This program is from Chapter 4 review question 22. It it a simulated
 * slot machine. The user is given a certain balance, and asked to enter an 
 * amount to gamble. The slot machine then runs. 3 numbers are generated,
 * if all three match the user wins the gamble * 3. if two match, the user
 * wins gamble * 2. if none match the user wins nothing. Each time the 
 * player loses the amount gambled. When the slot machine finishes, the
 * user is asked if they would like to play again.
 * @author rhy
 *
 */
public class Chapter4Prac22 
{

	public static void main(String[] args) 
	{
		double userMoney = 100000.0;
		
		Scanner keyb = new Scanner(System.in);
		
		
		Random rand = new Random();
		
		char answ = 'Y';
		
		while (answ == 'Y')
		{
			System.out.print("Enter the amount to gamble: ");
			double gamble = keyb.nextDouble();
			keyb.nextLine();
			
			int iter1 = 0, iter2 = 0, iter3 = 0;
			
			for (int i = 1; i <= 3; i++)
			{
				
				int random = rand.nextInt(6) + 1;
				
				switch (random)
				{
					case 1:
						System.out.println("Cherries");
						break;
					case 2:
						System.out.println("Oranges");
						break;
					case 3:
						System.out.println("Plums");
						break;
					case 4:
						System.out.println("Bells");
						break;
					case 5:
						System.out.println("Melons");
						break;
					case 6:
						System.out.println("Bars");
						break;
					default:
						System.out.println("Error!");
				}		
				
				if (i == 1)
				{
					iter1 = random;
				}
				else if (i == 2)
				{
					iter2 = random;
				}
				else if (i == 3)
				{
					iter3 = random;
				}
				
			}
			
			if (iter1 == iter2 && iter2 == iter3)
			{
				System.out.println("You Won " + gamble * 3 + "!");
				userMoney += gamble * 3;
				userMoney -= gamble;
				System.out.println("Your new balance is " + userMoney);
			}
			else if ((iter1 == iter2 && iter2 != iter3) || (iter1 == iter3 && iter2 != iter3) || (iter2 == iter3 && iter1 != iter2))
			{
				System.out.println("You Won " + gamble * 2 + "!");
				userMoney += gamble * 2;
				userMoney -= gamble;
				System.out.println("Your new balance is " + userMoney);
			}
			else
			{
				System.out.println("You Won 0...");
				userMoney -= gamble;
				System.out.println("Your balance is " + userMoney);
			}
			
			System.out.print("Do you want to play again? (Y/N): ");
			String answer = keyb.nextLine().toUpperCase();
			answ = answer.charAt(0);
		}
		
		keyb.close();
	}

}
