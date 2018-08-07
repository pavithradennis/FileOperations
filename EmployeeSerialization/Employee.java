package EmployeeSerialization;
//class to accept employee details
import java.io.Serializable;

public class Employee implements Serializable { //all details of employee
	private static final long serialVersionUID = -97867087978089L;
	private int id;
	private String empName;
	private float salary;

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	//parameterized constructor
	public Employee(int id, String empName, float salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}

	//toString method to display the employee details
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
