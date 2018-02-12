import java.util.*;
import java.io.*;
import java.text.*;
public class InventoryAdd 
	{
	ArrayList <Stuff> inventory = new ArrayList <Stuff>();
	public static void addArray() throws IOException
		{
		Scanner file = new Scanner(new File ("HereItIs.txt"));
		while(file.hasNextLine())
			{
			String line = file.nextLine();
			String[] arr = line.split(" ");
			}
		}
	}
