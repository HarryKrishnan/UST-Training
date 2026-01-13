package java_inheritance_pack;

class Manager {

	int bonus;
}

public class Employee extends Manager {

	int salary;

	void totalSalary() {

		System.out.println(salary + bonus);
	}

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.salary = 30000;
		emp.bonus = 10000;

		emp.totalSalary();

	}

}
