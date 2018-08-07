package ObjectSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//class to implement deserialization
public class Deserialization 
{
 public static void main(String[] args)
 {
	 ArrayList<MyClass> list;
	 try (FileInputStream fis = new FileInputStream("list.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			list = (ArrayList<MyClass>) ois.readObject();
			System.out.println(list);
			
			//handling exceptions
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
 }
}
