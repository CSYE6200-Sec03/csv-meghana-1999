package edu.neu.csye6200;

public class Driver {
	public static void main(String args[]) {
		School.demo();
	}

}


/*OUTPUT
 Teacher Object State:
----------
Teacher [hourlyWage=30, id=123, age=56, first_name=ROSY, last_name=BLADE, parent_first_name=PINKY, parent_last_name=BLADE]

Student Object State:
----------
ID:101	AGE:23	First_Name:TONY	Last_Name:STARK	GPA:3.9	Parent_first_name:HENRY	Parent_Last_Name:STARK	Student_ID:126457
ID:181	AGE:21	First_Name:EMLY	Last_Name:CLARK	GPA:3.5	Parent_first_name:ALIA	Parent_Last_Name:CLARK	Student_ID:374526
ID:121	AGE:34	First_Name:JAME	Last_Name:WILLY	GPA:3.8	Parent_first_name:MARY	Parent_Last_Name:WILLY	Student_ID:345671
ID:234	AGE:28	First_Name:JOHN	Last_Name:JACKY	GPA:3.6	Parent_first_name:JILL	Parent_Last_Name:JACKY	Student_ID:567383
ID:567	AGE:32	First_Name:POPE	Last_Name:SMITH	GPA:2.5	Parent_first_name:ALLI	Parent_Last_Name:SMITH	Student_ID:456284

Sorting By GPA:
----------
ID:567	AGE:32	First_Name:POPE	Last_Name:SMITH	GPA:2.5	Parent_first_name:ALLI	Parent_Last_Name:SMITH	Student_ID:456284
ID:181	AGE:21	First_Name:EMLY	Last_Name:CLARK	GPA:3.5	Parent_first_name:ALIA	Parent_Last_Name:CLARK	Student_ID:374526
ID:234	AGE:28	First_Name:JOHN	Last_Name:JACKY	GPA:3.6	Parent_first_name:JILL	Parent_Last_Name:JACKY	Student_ID:567383
ID:121	AGE:34	First_Name:JAME	Last_Name:WILLY	GPA:3.8	Parent_first_name:MARY	Parent_Last_Name:WILLY	Student_ID:345671
ID:101	AGE:23	First_Name:TONY	Last_Name:STARK	GPA:3.9	Parent_first_name:HENRY	Parent_Last_Name:STARK	Student_ID:126457

Sorting By ID:
----------
ID:101	AGE:23	First_Name:TONY	Last_Name:STARK	GPA:3.9	Parent_first_name:HENRY	Parent_Last_Name:STARK	Student_ID:126457
ID:121	AGE:34	First_Name:JAME	Last_Name:WILLY	GPA:3.8	Parent_first_name:MARY	Parent_Last_Name:WILLY	Student_ID:345671
ID:181	AGE:21	First_Name:EMLY	Last_Name:CLARK	GPA:3.5	Parent_first_name:ALIA	Parent_Last_Name:CLARK	Student_ID:374526
ID:234	AGE:28	First_Name:JOHN	Last_Name:JACKY	GPA:3.6	Parent_first_name:JILL	Parent_Last_Name:JACKY	Student_ID:567383
ID:567	AGE:32	First_Name:POPE	Last_Name:SMITH	GPA:2.5	Parent_first_name:ALLI	Parent_Last_Name:SMITH	Student_ID:456284

Sorting By Student_ID:
----------
ID:101	AGE:23	First_Name:TONY	Last_Name:STARK	GPA:3.9	Parent_first_name:HENRY	Parent_Last_Name:STARK	Student_ID:126457
ID:121	AGE:34	First_Name:JAME	Last_Name:WILLY	GPA:3.8	Parent_first_name:MARY	Parent_Last_Name:WILLY	Student_ID:345671
ID:181	AGE:21	First_Name:EMLY	Last_Name:CLARK	GPA:3.5	Parent_first_name:ALIA	Parent_Last_Name:CLARK	Student_ID:374526
ID:567	AGE:32	First_Name:POPE	Last_Name:SMITH	GPA:2.5	Parent_first_name:ALLI	Parent_Last_Name:SMITH	Student_ID:456284
ID:234	AGE:28	First_Name:JOHN	Last_Name:JACKY	GPA:3.6	Parent_first_name:JILL	Parent_Last_Name:JACKY	Student_ID:567383

Sorting By First Name:
----------
ID:181	AGE:21	First_Name:EMLY	Last_Name:CLARK	GPA:3.5	Parent_first_name:ALIA	Parent_Last_Name:CLARK	Student_ID:374526
ID:121	AGE:34	First_Name:JAME	Last_Name:WILLY	GPA:3.8	Parent_first_name:MARY	Parent_Last_Name:WILLY	Student_ID:345671
ID:234	AGE:28	First_Name:JOHN	Last_Name:JACKY	GPA:3.6	Parent_first_name:JILL	Parent_Last_Name:JACKY	Student_ID:567383
ID:567	AGE:32	First_Name:POPE	Last_Name:SMITH	GPA:2.5	Parent_first_name:ALLI	Parent_Last_Name:SMITH	Student_ID:456284
ID:101	AGE:23	First_Name:TONY	Last_Name:STARK	GPA:3.9	Parent_first_name:HENRY	Parent_Last_Name:STARK	Student_ID:126457

Sorting By Last Name:
----------
ID:181	AGE:21	First_Name:EMLY	Last_Name:CLARK	GPA:3.5	Parent_first_name:ALIA	Parent_Last_Name:CLARK	Student_ID:374526
ID:234	AGE:28	First_Name:JOHN	Last_Name:JACKY	GPA:3.6	Parent_first_name:JILL	Parent_Last_Name:JACKY	Student_ID:567383
ID:567	AGE:32	First_Name:POPE	Last_Name:SMITH	GPA:2.5	Parent_first_name:ALLI	Parent_Last_Name:SMITH	Student_ID:456284
ID:101	AGE:23	First_Name:TONY	Last_Name:STARK	GPA:3.9	Parent_first_name:HENRY	Parent_Last_Name:STARK	Student_ID:126457
ID:121	AGE:34	First_Name:JAME	Last_Name:WILLY	GPA:3.8	Parent_first_name:MARY	Parent_Last_Name:WILLY	Student_ID:345671
*/
