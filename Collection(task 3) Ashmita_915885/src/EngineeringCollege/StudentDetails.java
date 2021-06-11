package EngineeringCollege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentDetails {

	public static void main(String[] args) {
		
		StudentDemo student1 = new StudentDemo(1, "Ashu", "female", "cse", 2021, 90);
		StudentDemo student2 = new StudentDemo(4, "Mohit", "male", "cse", 2020, 77);
		StudentDemo student3 = new StudentDemo(2, "Anjali", "female", "cse", 2017, 86);
		StudentDemo student4 = new StudentDemo(4, "Rahul", "male", "mech", 2016, 78);
		StudentDemo student5 = new StudentDemo(3, "Anuska", "female", "ece", 2020, 64);
		StudentDemo student6 = new StudentDemo(4, "Rohan", "male", "ece", 2021, 91);
		
		List<StudentDemo> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		
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
		
		//count no of students in each department
		System.out.println("No of students in each department");
		Map<String, Integer> studentInDepartment = new HashMap<>();
		for (StudentDemo student : studentList) {
			studentInDepartment.put(student.getDepartment(), (studentInDepartment.getOrDefault(student.getDepartment(), 0) + 1));
		}
		
		for (String dept : studentInDepartment.keySet()) {
			System.out.println(dept + " - " + studentInDepartment.get(dept));
		}
		
		//average score of each department
		//String averageScoreDept=null;
		float averageScore=0;
		int count = 0;
		for(StudentDemo student : studentList) {
			if(student.getDepartment() == "cse") {
				averageScore += student.getScore();
				count++;
				
			}
		}
		System.out.println("Average score of CSE dept is " + averageScore/count);
		
		float averageScore1=0;
		int count1 = 0;
		for(StudentDemo student : studentList) {
			if(student.getDepartment() == "ece") {
				averageScore1 += student.getScore();
				count1++;
				
			}
		}
		System.out.println("Average score of ECE dept is " + averageScore1/count1);
		
		//highest score in each department
		String highScore = null;
		int hscore = 0;
		for (StudentDemo student : studentList) {
			if (student.getDepartment() == "cse" &&  student.getScore() > hscore) {
				highScore = student.getName();
				hscore = student.getScore();
			}
		}
		System.out.println("Student with highest score in CSE dept is: " + highScore);
		
		//Student with highest score in gender
		String highestScoreStudent = null;
		int highestScore = 0;
		for (StudentDemo student : studentList) {
			if (student.getGender() == "male" && student.getScore() > highestScore) {
				highestScoreStudent = student.getName();
				highestScore = student.getScore();
			}
		}
		
		System.out.println("Male student with highest score: " + highestScoreStudent);
		
		String highestScoreStudent1 = null;
		int highestScore1 = 0;
		for (StudentDemo student : studentList) {
			if (student.getGender() == "female" && student.getScore() > highestScore1) {
				highestScoreStudent1 = student.getName();
				highestScore1 = student.getScore();
			}
		}
		
		System.out.println("Female student with highest score: " + highestScoreStudent1);
		
	}

}
