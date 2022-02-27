package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;
// Student class inherited from Person Class where Comparable interface implemented 

public class Student extends Person implements Comparable<Student>{
	public int student_ID;
	public double gpa;
	List<Student> sl=new ArrayList<>();
	public Student(){
		super();
	}
	public Student(int id, int age, String first_name, String last_name, String parent_first_name,
			String parent_last_name, int student_ID, double gpa) {
		super(id, age, first_name, last_name, parent_first_name, parent_last_name);
		this.student_ID = student_ID;
		this.gpa = gpa;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}
	//CompareTo method for sorting student list 
	@Override
	public int compareTo(Student s) {
		if(s.getGpa()==gpa) {
			return 0;
	}
		else if(gpa<s.getGpa()) {
			return -1;
		}
		else 
			return 1;
	
	}
	//comparator  method for sorting student list with ID
	public static int compareId(Student s1,Student s2)
	{
		return Integer.compare(s1.getId(),s2.getId());
	}
	//comparator method for sorting student list with Student_ID
	public static int Comparestudent_ID(Student s1,Student s2) {
		return  Integer.compare(s1.getStudent_ID(),s2.getStudent_ID());
	}
	//Comparator method for sorting student list with First Name
	public static int compareFirst_Name(Student s1,Student s2) {
		return s1.getFirst_name().compareToIgnoreCase(s2.getFirst_name());
	}
	//Comparator method for sorting student list with Last Name
	public static int compareLast_Name(Student s1,Student s2) {
		return s1.getLast_name().compareToIgnoreCase(s2.getLast_name());
	}
	@Override
	public String toString() {
		return ("ID:" + getId() + "\tAGE:" + getAge() + "\tFirst_Name:" + getFirst_name() + "\tLast_Name:" + getLast_name() + "\tGPA:" + getGpa()+ 
				"\tParent_first_name:" + getParent_first_name()+ "\tParent_Last_Name:" + getParent_last_name()+ "\tStudent_ID:" + getStudent_ID());
	}
	public List<Student> addStudent(){
		FileUtil fu=new FileUtil();
		List<String> in=new ArrayList<>();
		in=fu.filereader();
		for(String s:in) {
			String[] str=s.split(",");
			int id=convertint(str[0]);
			int age=convertint(str[1]);
			String first_name=str[2];
			String last_name=str[3];
			String parent_firstname=str[4];
			String parent_lastname=str[5];
			int student_id=convertint(str[6]);
			double gpa=convertdouble(str[7]);
			sl.add(new Student(id,age, first_name, last_name, parent_firstname, parent_lastname,student_id,gpa));
		}
		return sl;
	}
	//Integer parsing conversion
	private int convertint(String sn) {
		int i=0;
		try{
			i=Integer.parseInt(sn);
			
		}
		catch(NumberFormatException n){
			n.printStackTrace();	
		}
		return i;
	}
	//Double pasrsing conversion
	private double convertdouble(String sn) {
		double i=0;
		try{
			i=Double.parseDouble(sn);
			
		}
		catch(NumberFormatException n){
			n.printStackTrace();	
		}
		return i;
	}
}
	
		
	


