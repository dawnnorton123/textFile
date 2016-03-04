//This program reads a text file and displays each record

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile1 {
	private static Scanner input;//declares a Scanner that will be used to retrieve input from the file
	private int x;//private so no one can change it

	public static void main(String[] args)
	{
		
openFile();//opens the file
readRecords();//reads the names
closeFile();//closes the file
		
	}
	//open file clients.txt
	public static void openFile()//opens the file for reading by instantiating a Scanner
	{
		try
		{
			input = new Scanner(Paths.get("clients.txt"));// Scanner object will read from the file "clients.txt"
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file. Terminating.");//if file cannot be found it terminates
			System.exit(1);
		}
	}
	//reads the file
	public static void readRecords()//reads and displays records from the file
	{    //prints out the first and last names
		System.out.printf(" %-12s %-12s %n","First" + " Name"," Last" + " Name");//display headers for the columns
		
		try
		{
			//creating a string array
			String aline[];
			aline = new String[4];//array with 5 places
			int i=0;// start at 0
			
			while (input.hasNext()) //  while user has next name
			{
				aline[i] = input.nextLine();//inputs next line
				System.out.println(aline[i].toString()); // prints out String names
				i=i+1;//increments by 1
			}
			
			for (int x = 0; x < aline.length; x++)//runs the length of the array
			{
				System.out.println("Index : "+ x + " - "+ aline[x].toString());//prints from the array 
			}
		}
				
		catch(NoSuchElementException elementException)
		{
			System.err.println("Entered a wrong key. Terminating");//prints out error and terminates
		}
	}
public static void closeFile()// closes file and terminates action
{
	if(input !=null)
		input.close();
}
}//end class ReadTextFile
