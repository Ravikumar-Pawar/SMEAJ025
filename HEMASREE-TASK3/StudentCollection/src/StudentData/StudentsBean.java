package StudentData;

public class StudentsBean {
	private int ID ;
	private String Name ;
	private String Gender ;
	private String Dept ;
	private int PoY ;
	 Double Score ;
	public StudentsBean(int ID,String Name,String Gender,String Dept ,int PoY ,double Score ){
		this.ID=ID;
		this.Name=Name;
		this.Gender=Gender;
		this.Dept=Dept;
		this.PoY=PoY;
		this.Score=Score;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getPoY() {
		return PoY;
	}
	public void setPoY(int poY) {
		PoY = poY;
	}
	public Double getScore() {
		return Score;
	}
	public void setScore(Double score) {
		Score = score;
	}

}
