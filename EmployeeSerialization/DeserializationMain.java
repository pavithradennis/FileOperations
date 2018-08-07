package EmployeeSerialization;

// read object from the file and display it on the console screen
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationMain {

	public static void main(String[] args) {
		Employee employee;
		try (FileInputStream fis = new FileInputStream("employee.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			employee = (Employee) ois.readObject();
			System.out.println(employee);
			
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
