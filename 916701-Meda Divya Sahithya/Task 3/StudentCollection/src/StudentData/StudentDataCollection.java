package StudentData;


public class StudentDataCollection extends StudentMethods {
	
	
	
	public static void main(String[] args) {
		
		femalestudent.add(0,new StudentsBean(202101,"Divya","Female","CSE",2021,9.20));
		femalestudent.add(1,new StudentsBean(202105,"Kavya","Female","ECE",2020,8.79));
		femalestudent.add(2,new StudentsBean(202102,"Navya","Female","ECE",2019,9.34));
		femalestudent.add(3,new StudentsBean(202107,"Bhavya","Female","EEE",2020,7.20));
		femalestudent.add(4,new StudentsBean(202106,"Sravya","Female","IT",2022,8.80));
		
		malestudent.add(0,new StudentsBean(202104,"Rajesh","Male","CSE",2020,8.20));
		malestudent.add(1,new StudentsBean(202106,"Ramesh","Male","MECH",2021,7.90));
		malestudent.add(2,new StudentsBean(202108,"Suresh","Male","EEE",2019,9.04));
		malestudent.add(3,new StudentsBean(202109,"Mahesh","Male","MECH",2020,7.20));
		malestudent.add(4,new StudentsBean(202110,"Lokesh","Male","IT",2018,8.50));
		
		student.addAll(malestudent);
		student.addAll(femalestudent);
		
		insert_data(student,CSEstu,"CSE");
		insert_data(student,ECEstu,"ECE");
		insert_data(student,EEEstu,"EEE");
		insert_data(student,MECHstu,"MECH");
		insert_data(student,ITstu,"IT");
		
		menu();
		
	}

}
