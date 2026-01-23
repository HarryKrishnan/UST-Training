package java_encapsulation_pack;

public class Admission {

	private int marks;
	private String grade;

	public void setMarks(int marks) {

		this.marks = marks;

		if (marks >= 80) {
			grade = "A";
		} else if (marks >= 60) {
			grade = "B";
		} else if (marks >= 40) {
			grade = "C";
		} else {
			grade = "Fail";
		}
	}

	void displayResult() {

		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
	}

	public static void main(String[] args) {

		Admission stud = new Admission();

		stud.setMarks(45);
		stud.displayResult();

	}

}
