//Writing data to a following text with class Formatter

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile extends FileAndDirectoryInfo
{
	private static Formatter output;//uses a formatter to output strings to a file

	public static void main(String[] args) 
	{
		openFile();//opens file
		addRecords();//adds records, names in this case
		closeFile();//closes the file		
		
	}
	public static void  openFile()//open file clients.txt
	{
		try
		{//constructor takes a string argument that contains the name of the file including it's path
			output = new Formatter("clients.txt");//instantiates the formatter object
		}
		catch(SecurityException secuityException)//if the user does not have permission to write data to the file
		{
			System.err.println("Write permission denied. Terminating.");
			System.exit(1);//terminates the program
		}
		catch(FileNotFoundException fileNotFoundException)//if the file does not exist and a new file cannot be created, or there's an error opening the file
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1);//terminates program
		}
		
	}
	
	public static void addRecords() //adds records to the file
	{
		
			 Scanner input = new Scanner(System.in);//allows user to input
			System.out.printf("%s %n %s %n ", "First name, Last name ","Please enter end-of-file indicator to end input.");// prints the opening screen
		
			while(input.hasNext())//loop until end of file indicator
			{
				try
				{    //output a new record to file: assumes valid input
					output.format("%s %s %n", input.next(),input.next());
				}
				catch(FormatterClosedException formatterClosedException)//
				{
					System.out.println("Error writing to file. Terminating.");//prints out the termination message
					break;
				}
				catch(NoSuchElementException elementException)//
				{
					System.err.println("Invalid input. Please try again.");
					input.nextLine();//discard input so user can try again
				}
				
				System.out.print("?");
				}//end while loop
			}//end method addRecords

	//closes the file
	public static void closeFile() 
	{
		if(output !=null)
			output.close();
	}
	
}//end class create text file








