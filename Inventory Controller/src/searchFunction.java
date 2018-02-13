import java.util.ArrayList;
import java.util.Scanner;

public class searchFunction
	{
		static ArrayList <Stuff> inventory = new ArrayList <Stuff>();
		public static void search()
			{
			Scanner user = new Scanner(System.in);
			System.out.println("Hello! Anything you would like to search for today?");
			String person = user.nextLine();
		
			for(int i = 0; i < inventory.size(); i++)
				{
				if(inventory.get(i).getName().contains(person))
					{
					System.out.println(inventory.get(i).getName());
					}
				}
			
			}

	}
