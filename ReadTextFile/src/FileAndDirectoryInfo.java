
//Resources: Java book, You Tube, Sam a tutor
//File class used to obtain file and directory info.
import java.io.IOException;
import java .nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file or directory name: ");
		
		Path path = Paths.get(input.nextLine());//creates a path based of user input
		
		if (Files.exists(path))//if a path exists, output info about it
		{          // displays file information or directory info
			System.out.printf("%n%s exists%n",path.getFileName());//gets the String name of the file or directory without any location info.
			System.out.printf("%s a directory%n",Files.isDirectory(path)? "Is" : "Is not");//receives a Path and returns a boolean indicating whether that Path represents a directory
			System.out.printf("%s an absolute path%n", path.isAbsolute()? "Is" : "Is not");
			System.out.printf("Last modified: %s%n",Files.getLastModifiedTime(path));//receives a path and returns a file name, indicating when the file was last modified
			System.out.printf("Size: %s%n", Files.size(path));//receives a path and returns a long representing the number of bytes in the file directory
			System.out.printf("Path: %s%n", path);//returns a String representing the Path
			System.out.printf("Absolute path:%s%n",path.toAbsolutePath());// converts the Path on which it's called to absolute path.
			
			if (Files.isDirectory(path));
			{
				System.out.println("%nDirectory contents:%n");//output directory listing/if Path represents a directory
				
				//object for cycling through a directory's contents
				DirectoryStream<Path>directoryStream = Files.newDirectoryStream(path);//use Files static method new directoryStream to get a DirectoryStream<Path>containing Path objects for the directory's contents
				
				for(Path p: directoryStream)//display the String representation of each Path in the DirectoryStream<Path>
					System.out.println(p);
			}
			
			}
		else  //if no file output error message
		{
			System.out.printf("%s does not exist%n", path);
		}//end main

	}////end class FDile AndDirectoryInfo

}
