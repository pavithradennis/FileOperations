package EmployeeSerialization;

//class to write object in the file
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Pavithra", 20000);
		String filename = "employee.ser";

		try {// input and output streams
			FileOutputStream fis = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fis);

			oos.writeObject(employee);
			System.out.println("Serialization successful");
			
			//handling of exceptions
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
