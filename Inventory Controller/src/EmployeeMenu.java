
import java.util.*;

public class EmployeeMenu
	{
		public static void intialMenu()
		{
			int decision = 0;
			try
			{
				Scanner employeeIn = new Scanner(System.in);
				System.out.println("What would you like to look at? \n(1)Orders \n(2)Expences");
				decision = employeeIn.nextInt();
			}
			catch(InputMismatchException exc)
			{
				System.out.println("You need to enter a number, either 1 or 2");
				intialMenu();
			}
			if(decision == 1)
					orders();
			else if(decision == 2)
					expences();
			else
				{
					System.out.println("Please enter either 1 or 2");
					intialMenu();
				}
		}

		private static void expences()
			{
				// TODO Auto-generated method stub
				
			}

		private static void orders()
			{
				// TODO Auto-generated method stub 
				
			}
	}
