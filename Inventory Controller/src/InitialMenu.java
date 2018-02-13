import java.util.*;

public class InitialMenu
	{
		public static int eOrB;
	public static void firstQuestion()
	{
		try
		{
			Scanner userIn = new Scanner(System.in);
			System.out.println("Are you an employee or a buyer? \n(0) Buyer \n(1) Employee");
			eOrB = userIn.nextInt();
			checkEOrB();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("You need to enter a number.");
			firstQuestion();
		}
		
	}
	public static void checkEOrB()
	{
		if(eOrB == 1)
			{
				try
					{
				Scanner pass = new Scanner(System.in);
				System.out.println("What is the password?");
				int thePass = pass.nextInt();
				if(thePass == 1234)
					{
						// This will call the method to run the rest of the employee code.
					}
				else
					{
						System.out.println("That is not the right password.");
						firstQuestion();
					}
					}
				catch(InputMismatchException exc)
					{
						System.out.println("You need to enter a number.");
						checkEOrB();
					}
			}
		else if(eOrB == 0)
			{
			buyerExperience();
			}
		else
			{
				System.out.println("You need to enter either 0 or 1");
				firstQuestion();
			}
	}
	public static void buyerExperience()
		{//work
		ArrayList <Stuff> cart = new ArrayList <Stuff>();
		System.out.println("Would you like to ");
		System.out.println("1). Shop from the inventory");
		System.out.println("2). Search our database");
		Scanner userIn = new Scanner(System.in);
		int choice = userIn.nextInt();
		if (choice == 1)
			{
			
			}
		else 
			{
			
			}
		}
	}
