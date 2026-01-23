package java_encapsulation_pack;

class Employee {

	private int empId;
	private double salary;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary! Salary must be greater than 0.");
		}
	}

	public void displaySalary() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpId(201);
		emp.setSalary(30000);

		emp.displaySalary();

		
		System.out.println();
		// Invalid salary test
		emp.setSalary(-5000);
		emp.displaySalary();
	}
}
