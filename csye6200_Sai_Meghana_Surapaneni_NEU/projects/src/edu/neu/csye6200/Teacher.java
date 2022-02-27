package edu.neu.csye6200;
//Teacher class inherited from Person class

public class Teacher extends Person {
	
	public int hourlyWage;
//Teacher super constructor	
	public Teacher() {
		super();
	}
	//Teacher constructor with fields
	public Teacher(int id, int age, String first_name, String last_name, String parent_first_name,
			String parent_last_name, int hourlyWage) {
		super(id, age, first_name, last_name, parent_first_name, parent_last_name);
		this.hourlyWage = hourlyWage;
	}


	public int getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


	@Override
	public String toString() {
		return "Teacher [hourlyWage=" + hourlyWage + ", id=" + id + ", age=" + age + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", parent_first_name=" + parent_first_name + ", parent_last_name="
				+ parent_last_name + "]";
	}
	 
}
