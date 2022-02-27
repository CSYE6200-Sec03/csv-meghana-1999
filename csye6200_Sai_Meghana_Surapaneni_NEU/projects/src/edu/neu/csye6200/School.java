package edu.neu.csye6200;
import java.util.*;
public class School {
	public static void demo() {
		List<Student> sll= new ArrayList<>();
		List<Teacher> ta=new ArrayList<>();
		ta.add(new Teacher(123,56,"ROSY","BLADE","PINKY","BLADE",30));
		System.out.println("Teacher Object State:\n----------"); 
		for(Teacher t:ta) {
			System.out.println(t);
		}
		System.out.println("\nStudent Object State:\n----------"); 
		Student s=new Student();
		sll=s.addStudent();
		for(Student stud:sll) {
			System.out.println(stud);
		}
//Sorting by GPA
		System.out.println("\nSorting By GPA:\n----------"); 
		Collections.sort(sll);
		for(Student stud:sll) {
			System.out.println(stud);
		}
//Sorting by ID
		System.out.println("\nSorting By ID:\n----------"); 
		sll.sort(Student::compareId);
		for(Student stud:sll) {
			System.out.println(stud);
		}
//Sorting by Student_ID
		System.out.println("\nSorting By Student_ID:\n----------"); 
		sll.sort(Student::Comparestudent_ID);
		for(Student stud:sll) {
			System.out.println(stud);
		}
//Sorting by First Name		
		System.out.println("\nSorting By First Name:\n----------"); 
		sll.sort(Student::compareFirst_Name);
		for(Student stud:sll) {
			System.out.println(stud);
		}
//Sorting by Last Name
		System.out.println("\nSorting By Last Name:\n----------"); 
		sll.sort(Student::compareLast_Name);
		for(Student stud:sll) {
			System.out.println(stud);
		}
	}

}
