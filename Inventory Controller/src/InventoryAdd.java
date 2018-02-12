import java.util.*;
import java.io.*;
import java.text.*;
public class InventoryAdd 
	{
	static ArrayList <Stuff> inventory = new ArrayList <Stuff>();
	public static void addArray() throws IOException
		{
		Scanner file = new Scanner(new File ("HereItIs.txt"));
		while(file.hasNextLine())
			{
			String line = file.nextLine();
			String[] arr = line.split(" ");
			arr[1] = arr[1].replaceAll("[^\\p{L}\\p{Nd}]+", " ");
			inventory.add(new Stuff(Integer.valueOf(arr[0]), arr[1], Integer.valueOf(arr[2]), Integer.valueOf(arr[3])));
			}
		}
	}
