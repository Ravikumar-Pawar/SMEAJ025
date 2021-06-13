package Engineering_College;


public class Student {

	private int ID;
	private String name;
	private String gender;
	private String department;
	private int passoutYear;
	private int score;
	public Student(int iD, String name, String gender, String department, int passoutYear, int score) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.passoutYear = passoutYear;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", passoutYear=" + passoutYear + ", score=" + score + "]";
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getPassoutYear() {
		return passoutYear;
	}
	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
