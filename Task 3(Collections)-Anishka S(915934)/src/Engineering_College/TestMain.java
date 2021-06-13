package Engineering_College;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> s=new ArrayList<>();
		Student student1=new Student(1,"ani","F","ECE",2021,80);
		Student student2=new Student(2,"preethi","F","EEE",2021,93);
		Student student3=new Student(3,"hasini","F","IT",2019,92);
		Student student4=new Student(4,"aus","M","MECH",2019,98);
		Student student5=new Student(5,"bala","M","ECE",2020,90);
		s.add(student1);
		s.add(student5);
		s.add(student4);
		s.add(student3);
		s.add(student2);
		
		//1. How many male and female students r there
		int male=(int) s.stream().filter(obj-> obj.getGender().equalsIgnoreCase("M")).count();
		int female= (int) s.stream().filter(obj -> obj.getGender().equalsIgnoreCase("F")).count();
		System.out.println("male stduents: " +male);
		System.out.println("female students: "+ female);
		
		//2. Print all the students and their information
		System.out.println("Stduent info");
		for(Student stu:s) {
			System.out.println(stu);
		}
		
		//3. Print all the department in college
		System.out.println("ALL Dept");
		Set<String> dept=s.stream().map(obj->obj.getDepartment()).collect(Collectors.toSet());
		//for each
		dept.forEach(System.out::println);
		
		//4. Print the name of students who has graduated in 2020
		System.out.println("students who has graduated in 2020");
		s.forEach(obj->{
			if(obj.getPassoutYear()==2020) {
				System.out.println(obj.getName());
			}
		}
		);
		
		//5. count number of students in each department
		System.out.println("number of students in each department");
		Map<String,Integer> m=new HashMap<>();
		for(Student stu:s) {
			m.put(stu.getDepartment(), (m.getOrDefault(stu.getDepartment(), 0)+1));//if dep occurs 1st time default value is 0 & 1 will be added to value.
		}
		
		for(String dep: m.keySet()) {
			System.out.println(dep+ ": "+ m.get(dep));
		}
		
		//6. what is average score of each department
		System.out.println("Enter the department to get avg score");
		String department=sc.next();
		int count=0;
		float avg=0;
		for(Student average:s) {
			if(average.getDepartment().equalsIgnoreCase(department)) {
				avg=avg + average.getScore();
				count++;
			}
		}
		System.out.println(avg/count);
		
		//7. name the student who has high score in each department
		System.out.println("Enter the department to get high score");
		String d=sc.next();
		int max=0;
		String name="";
		for(Student highscore:s) {
			if(highscore.getDepartment().equalsIgnoreCase(d)) {
				if(highscore.getScore()>max) {
					max=highscore.getScore();
					name=highscore.getName();
				}
			}
		}
		System.out.println(name + " scored high in "+ d);
		
		//8. name the student who has scored high, consider Gender, e.g: High score in Male, High score in Female
		
		int maximum_f=0;
		int maximum_m=0;
		String femaleStudent="";
		String maleStudent="";
		for(Student score:s) {
				if(score.getGender().equalsIgnoreCase("m") && score.getScore()>maximum_f) {
					maximum_f=score.getScore();
					femaleStudent=score.getName();
				}
				
				if(score.getGender().equalsIgnoreCase("f") && score.getScore()>maximum_m) {
					maximum_m=score.getScore();
					maleStudent=score.getName();
				}
				
			}
		System.out.println("high score male: "+ maleStudent);
		System.out.println("high score female: "+ femaleStudent);
		
		
		
	}
		
}		