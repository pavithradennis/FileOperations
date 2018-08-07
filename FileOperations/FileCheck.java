//program to check if a file exists
package FileOperations;
import java.io.File;
public class FileCheck
{
 public static void main(String[] args)
 {
	 File f = new File("P:\\Users\\pdennis\\Desktop\\Sample.txt"); //pathname
	 if(f.exists())
	 {
		 System.out.println("File exists!");
	 }
	 else
	 {
		 System.out.println("File does not exist!");
	 }
 }
}
