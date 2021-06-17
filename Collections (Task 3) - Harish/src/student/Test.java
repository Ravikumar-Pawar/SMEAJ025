package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "First", "male", "mech", 2021, 90); 
		Student student2 = new Student(2, "Second", "female", "cse", 2020, 86);
		Student student3 = new Student(3, "Third", "male", "ece", 2021, 84);
		Student student4 = new Student(4, "Fourth", "female", "mech", 2021, 88);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		//How many male and female students are there?
		int maleCount = (int) studentList.stream().filter(obj -> obj.getGender().equals("male")).count();
		int femaleCount = (int) studentList.stream().filter(obj -> obj.getGender().equals("female")).count();
		
		System.out.println("Male count: " + maleCount);
		System.out.println("Female count: " + femaleCount);
		
		//Print all student info
		System.out.println("Print all student info");
		studentList.forEach(System.out::println);
		
		//Print all departments
		System.out.println("Print all departments");
		Set<String> departments = studentList.stream().map(obj -> obj.getDepartment()).collect(Collectors.toSet());
		departments.forEach(System.out::println);
		
		//Print name of students graduated in 2020
		System.out.println("Print name of students graduated in 2020");
		studentList.forEach(obj -> {
			if (obj.getPassoutYear() == 2020)
				System.out.println(obj.getName());
		});
		
		//No of students in each department
		System.out.println("No of students in each department");
		Map<String, Integer> studentInDepartment = new HashMap<>();
		for (Student student : studentList) {
			studentInDepartment.put(student.getDepartment(), (studentInDepartment.getOrDefault(student.getDepartment(), 0) + 1));
		}
		
		for (String dept : studentInDepartment.keySet()) {
			System.out.println(dept + " - " + studentInDepartment.get(dept));
		}
		
		//Student with highest score
		String highestScoreStudent = null;
		int highestScore = 0;
		for (Student student : studentList) {
			if (student.getScore() > highestScore) {
				highestScoreStudent = student.getName();
				highestScore = student.getScore();
			}
		}
		
		System.out.println("Student with highest score: " + highestScoreStudent);
		
	}

}
