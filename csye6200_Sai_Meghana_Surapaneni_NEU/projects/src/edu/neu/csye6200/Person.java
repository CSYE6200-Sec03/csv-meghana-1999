package edu.neu.csye6200;

public class Person {
	public int id;
	public int age;
	public String first_name;
	public String last_name;
	public String parent_first_name;
	public String parent_last_name;
	//Person Class with super() constructor
	public Person() {
		super();
		
	}
	//Person constructor
	public Person(int id, int age, String first_name, String last_name, String parent_first_name,
			String parent_last_name) {
		super();
		this.id = id;
		this.age = age;
		this.first_name = first_name;
		this.last_name = last_name;
		this.parent_first_name = parent_first_name;
		this.parent_last_name = parent_last_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getParent_first_name() {
		return parent_first_name;
	}
	public void setParent_first_name(String parent_first_name) {
		this.parent_first_name = parent_first_name;
	}
	public String getParent_last_name() {
		return parent_last_name;
	}
	public void setParent_last_name(String parent_last_name) {
		this.parent_last_name = parent_last_name;
	}
	
}
