package FileOperations;
import java.util.*;
import java.io.*;
//program to perform grep to find words in a file
public class GrepOperation
{
 public static void main(String[] args) throws FileNotFoundException
 {
	 int count=0,notFound=0;
	 File file = new File("P:\\Users\\pdennis\\Desktop\\Sample.txt"); //input file
	 Scanner in = new Scanner(System.in);
	 Scanner input = new Scanner(file);
	 
	 System.out.println("Enter the search string");
	 String name = in.nextLine(); //input the string to be searched
	 
	 while(input.hasNextLine())
	 {
		 String line = input.nextLine();
		 if(line.contains(name)) //condition to check the line at which string is present
		 {
			 count+=1;
			 System.out.println("String" + " "+name+ "occurs at line/s" +" "+line+ " "+ "found at line number"+ " "+count);
		 }
		 else
		 {
			 count+=1;
			 notFound++;
		 }
	 }
	 
	 if(count==notFound) //condition where string is not present in the file
	 {
		 System.out.println("String"+ " "+name+ " "+ "not found");
	 }
 }
}
