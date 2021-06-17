package student;

public class Student {

	private int id;
	private String name;
	private String gender;
	private String department;
	private int passoutYear;
	private int score;

	public Student(int id, String name, String gender, String department, int passoutYear, int score) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.passoutYear = passoutYear;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, gender=%s, department=%s, passoutYear=%s, score=%s]", id, name,
				gender, department, passoutYear, score);
	}

}
