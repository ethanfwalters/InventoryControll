
import java.util.*;

public class EmployeeMenu
	{
		public static void intialMenu()
		{
			int decision = 0;
			try
			{
				Scanner employeeIn = new Scanner(System.in);
				System.out.println("What would you like to look at? \n(1)Orders \n(2)Expences \n(3)Change Password");
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
			else if(decision == 3)
					changePass();
			else
				{
					System.out.println("Please enter either 1 or 2");
					intialMenu();
				}
		}

		private static void changePass()
			{
				// TODO Auto-generated method stub
				
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
