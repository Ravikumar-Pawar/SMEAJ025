package StudentData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentMethods {
	
static ArrayList<String> dept=new ArrayList<String>(Arrays.asList("ECE","EEE","MECH","CSE","EIE"));
static ArrayList<StudentsBean> malestudent=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> femalestudent=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> ECEstu=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> EEEstu=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> MECHstu=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> CSEstu=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> EIEstu=new ArrayList<StudentsBean>();
static ArrayList<StudentsBean> student=new ArrayList<StudentsBean>();
	
  public static void insert_data(ArrayList<StudentsBean> stu,ArrayList<StudentsBean> deptstu,String dept) 
  {
	 for(StudentsBean o:stu)
	 {
		 if(o.getDept().equals(dept))
		 {
			 deptstu.add(o);
		 }	 
	 }	 
  }	
	public static void dis_2020PoY(ArrayList<StudentsBean> stu)
	{   int k=1;
		for(StudentsBean info:stu)
	   {   
		if(info.getPoY()==2020)
		System.out.println(k+"."+info.getName());
		k++;
	   }
		
	}
	public static void dis_dept(ArrayList<String> dept) 
	{
		System.out.println("Available Departments in the college:\n");
		for(String dpt:dept)
		{
			System.out.println("->"+dpt);
			
		}
		
	}
	public static void dis_stu(ArrayList<StudentsBean> stu)
	{
		for(StudentsBean info:stu) 
		{
			System.out.println("ID: "+info.getID());
			System.out.println("Name: "+info.getName());
			System.out.println("Gender: "+info.getGender());
			System.out.println("Dept: "+info.getDept());
			System.out.println("Year of Passing: "+info.getPoY());
			System.out.println("Score: "+info.getScore()+"\n");	
		}
		
	}		
	
	public static void high_score(ArrayList<StudentsBean> stu)
	{
		ArrayList<Double> a=new ArrayList<Double>();
		for(StudentsBean info:stu) 
		{
			a.add(info.getScore());
		}
		Collections.sort(a,Collections.reverseOrder());
		for(StudentsBean info:stu) 
		{
		if(a.get(0)==info.getScore())
		  {
			System.out.println("Highest scorer : "+info.getName());
			System.out.println("Score of "+info.getName()+" is: "+info.getScore());
		  }
	   }		
	}
		
	public static void avgScore(ArrayList<StudentsBean> stu,ArrayList<String> dept)
	{   float[] avg_score=new float[dept.size()];
	    for(String dpt:dept) 
		{   int k=0;
			for(StudentsBean info1:stu) 
			{
				if(info1.getDept().equals(dpt))
				{
		             avg_score[dept.indexOf(dpt)]+=info1.getScore();
					 k++;
				}
			}
				float a=avg_score[dept.indexOf(dpt)]/k;
				System.out.printf("Average Score of students in "+dpt+" Department is %.2f\n",a);	
		}
	 }
	
	public static void menu()
	{	
		while(true)
		{    Scanner sc=new Scanner(System.in);
		    System.out.println("\nChoose the option to display information:\n"
				+ "1. Count of female and male students.\n2.All students information.\n"
				+ "3.Department in  the college\n4.Name of students graduated in 2020\n"
				+ "5.Count of students in each Department\n6.Average score of each department\n7.Topper of each Department\n"
				+ "8.Topper in the college\n9.Exit");
			
			int c=sc.nextInt();
			
		switch(c) {
		case 1:
		{      System.out.println("Total students in the college:"+student.size());
		       System.out.println("Female students in the college:"+femalestudent.size());
		       System.out.println("Male students in the college:"+malestudent.size()+"\n");
			   break;
		}
		case 2:
		{      System.out.println("All students Details:\n");
		       System.out.println("Male students Details:\n");
		       dis_stu(malestudent);
		       System.out.println("Female students Details:\n");
		       dis_stu(femalestudent);
			   break;
		}
		case 3:
		{      dis_dept(dept);
			   break;
		}
		case 4:
		{    System.out.println("All students Names who passed out in 2020:\n"); 
			 dis_2020PoY(student);
		     break;
		}
		case 5:
		{    System.out.println("Count of Students in all Departments:\n");
		     System.out.println("Students in ECE Departments: "+ECEstu.size());
		     System.out.println("Students in EEE Departments: "+EEEstu.size());
		     System.out.println("Students in MECH Departments: "+MECHstu.size());
		     System.out.println("Students in CSE Departments: "+CSEstu.size());
		     System.out.println("Students in EIE Departments: "+EIEstu.size());
		     break;
		}
		case 6:
		{      System.out.println("Average Score of students in all Departments:\n");
		       avgScore(student,dept);
			   break;
		}
		case 7:
		{
			System.out.println(" Department Toppers: ");
		      while(true)
		      {
		     System.out.println("Select the Department to display:\n1.CSE\n2.ECE\n3.EEE\n4.MECH\n5.IT\n6.Exit\n ");
	         int dpt=sc.nextInt();
	          switch(dpt) 
	         {
	         case 1:{
	        	     System.out.println("In ECE Department: ");
			         high_score(ECEstu);
			         break;
	               }
	         case 2:{
	        	      System.out.println("In EEE Department: ");
		              high_score(EEEstu);
		              break;
	        	 
	                }
	         case 3:{
       	             System.out.println("In MECH Department: ");
	                 high_score(MECHstu);
	                 break;
       	 
                   }
	         case 4:{
       	             System.out.println("In CSE Department: ");
	                 high_score(CSEstu);
	                 break;
       	 
                    }
	         case 5:{
       	             System.out.println("In EIE Department: ");
	                  high_score(EIEstu);
	                 break;
       	 
                    }
	         case 6:
	        	 break;
	         default:
	         
       	            System.out.println("Enter valid choice!! ");  
	         }
           System.out.println("Select another Department?(y/n)");
           if(sc.next().equals("n")) { break;}
	        }
			break;  
		}
		case 8:
		{   System.out.println("Select a.In  Males  b.In Females c.Overall topper");
			String o=sc.next();
		     switch(o) {
		     case "a":
		     { System.out.println("In Males:");
		       high_score(malestudent);
		       break;
		     }
		     case "b":
		     { System.out.println("In females:");
		       high_score(femalestudent);
			   break;
			 }
		     case "c":
		     { System.out.println("Overall topper of the college:");
		       high_score(student);
			   break;
			 }
		     default:
		    	 System.out.println("Select option a or b");
		    	 
		   }
		    break;  
			   
		}
		
		case 9:
		{
			   System.exit(0);
			   sc.close();
		}
		default:
			System.out.println("Enter valid choice");
		}
		System.out.println("Do you want to continue Display?(y/n)");
	     String opt=sc.next();
	     if(opt.equals("n"))
	    	 System.exit(0);	     
		  }
	}

}
