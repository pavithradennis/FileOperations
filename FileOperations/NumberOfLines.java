//program to count the number of lines in a file
package FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfLines {

	public static void main(String[] args) throws IOException
	{
		int lineCount = 0;
		BufferedReader br = new BufferedReader(new FileReader("P:\\Users\\pdennis\\Desktop\\Sample.txt"));
		//call readLine to count the number of lines
		while(true)
		{
			String line = br.readLine();
			if(line==null)
			{
				break;
			}
			lineCount++;
		}
		br.close();
		System.out.println("Line count=" + " "+lineCount);
	}

}
