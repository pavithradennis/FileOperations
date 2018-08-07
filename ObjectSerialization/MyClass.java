package ObjectSerialization;

//class to implement serialization and deserialisation technique using ArrayList
import java.io.Serializable;

public class MyClass implements Serializable {
	// instance members
	private static final long serialVersionUID = 9749686017390764L;
	private int id;
	private String name;
	private double salary;

	public MyClass(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//toString method to print the instances
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
