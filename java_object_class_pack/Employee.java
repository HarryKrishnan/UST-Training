package java_object_class_pack;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	Employee() {
		
		empId = 007;
		empName = "Harikrishnan";
		salary = 40000;
	}
	
	void displayDetails () {
		
		System.out.println("Name : "+empName);
		System.out.println("ID : "+empId);
		System.out.println("Salary : "+salary);
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.displayDetails();
		

	}

}
