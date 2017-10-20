
public class Student {

	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;
	
	public Student(String firstName, String lastName, int gradeLevel,
			double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String n) {
		firstName = n;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String n) {
		lastName = n;
	}
	
	public int getGradeLevel() {
		return this.gradeLevel;
	}
	
	public void setGradeLevel(int n) {
		gradeLevel = n;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void setGPA(double n) {
		gpa = n;
	}
	
	public String toString() {
		String returnString = "";
		returnString += this.getLastName() + ", " + this.getFirstName();
		returnString += "   Grade " + this.getGradeLevel();
		returnString += "   GPA: " + this.getGPA();
		return returnString;
	}
	
}
