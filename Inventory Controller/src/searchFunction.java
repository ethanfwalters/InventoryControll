import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class searchFunction
	{
		
		public static void illSearch() throws IOException

			{
			Scanner user = new Scanner(System.in);
			System.out.println("Hello! Anything you would like to search for today?");
			String person = user.nextLine();

			int counter = 1;
			for(int i = 0; i < InventoryAdd.inventory.size(); i++)
				{
				if(InventoryAdd.inventory.get(i).getName().toLowerCase().contains(person))
					{
					System.out.println("item " + (i+1) + "). " + InventoryAdd.inventory.get(i).getName());
					System.out.println("    $" + InventoryAdd.inventory.get(i).getCost());
					System.out.println("");
					counter++;
					}
				}
			
			}

	}
