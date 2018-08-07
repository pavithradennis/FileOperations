package FileOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
//program to count number of words in a file
public class NumberOfWords
{
 public static void main(String[] args)
 {
	 BufferedReader br = null;
	 int wordCount=0;
	 try {
		 br = new BufferedReader(new FileReader("P:\\Users\\pdennis\\Desktop\\Sample.txt"));
		 //reading the first line into the current line
		 String currentLine = br.readLine();
		 while(currentLine !=null)
		 {
			 String[] words = currentLine.split(" ");
			 //counter updation of wordcount
			 wordCount = wordCount + words.length;
			 //reading subsequent lines
			 currentLine = br.readLine();
		 }
		 System.out.println("Number of words:" + " " + wordCount);
	 } catch(IOException e)
	 {
		 e.printStackTrace();
	 }
 }
}
