package ObjectSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//implementation of serialization
import java.util.ArrayList;

public class Serialization {

	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>(); // create arraylist
		MyClass m1 = new MyClass(101, "Pavithra", 10000);
		MyClass m2 = new MyClass(102, "Pavi", 20000);
		MyClass m3 = new MyClass(103, "Rima", 40000);
		MyClass m4 = new MyClass(104, "Dennis", 5000);
		MyClass m5 = new MyClass(105, "Regina", 500000);

		// to add to the list
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		// declaration of the file
		String filename = "list.ser";
		try (FileOutputStream fos = new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
			System.out.println("Serialization successful");
			
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
