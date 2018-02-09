import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String [] args) 
	{

		String employeePassword = "password";
		boolean isEmployee = false;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Hello. Are you a costumer or an employee?");
		String custOrEmp = in.nextLine();
		
		if (custOrEmp.contains("ostumer")) System.out.println("Welcome valued customer");
		if (custOrEmp.contains("mployee"))
		{
			System.out.println("Please enter password");
			String password = in.nextLine();
			if (password.equals(employeePassword)) 
			{
				System.out.println("Welcome back"); isEmployee = true;
			}
			else 
			{
				System.out.println("That is not the correct password.");
			}
		}
		
        String fileName = "HereItIs.txt";

        
        // This will reference one line at a time
        String line = null;

        try 
        {
        	// FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) System.out.println(line);

            // Always close files.
            bufferedReader.close();			
        }
        catch(FileNotFoundException ex)
        {
        	System.out.println("Unable to open file '" + fileName + "'");
        }
        
        catch(IOException ex) 
        {
            System.out.println("Error reading file '" + fileName + "'");					
            // Or we could just do this: 
            // ex.printStackTrace();
        }  
        //test   
    }
}