package java_object_class_pack;

public class StudentAdmission {

	int studId;
	String studName;
	String batch;
	String admissionType;

	StudentAdmission() {

		studId = 101;
		studName = "Anas";
		batch = "Bio-Maths";
		admissionType = "General";

	}

	public StudentAdmission(int studId, String studName, String batch, String admissionType) {

		this.studId = studId;
		this.studName = studName;
		this.batch = batch;
		this.admissionType = admissionType;
	}

	void display() {

		System.out.println("Student Id : " + studId);
		System.out.println("Student Name : " + studName);
		System.out.println("Student Batch : " + batch);
		System.out.println("Admission Type : "+admissionType);
	}

	public static void main(String[] args) {

		StudentAdmission stud1 = new StudentAdmission();
		stud1.display();

		StudentAdmission stud2 = new StudentAdmission(103, "Harikrishnan", "Science", "Merit");
		stud2.display();

	}

}
