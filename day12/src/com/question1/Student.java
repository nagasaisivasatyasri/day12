package com.question1;
import java.lang.Comparable;
import java.lang.String;
public class Student implements Comparable{
private int id;
private String studentname;
public Student(int id, String studentname) {
	//super();
	this.id = id;
	this.studentname = studentname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
@Override
public String toString() {
	return "Student [id=" + id + ", studentname=" + studentname + "]";
}
@Override
public int compareTo(Object o) {
	Student s1=(Student)o;
	if(this.studentname.equals(s1.studentname)) {
		return 1;
	}
	else if(this.studentname.equals(s1.studentname)) {
		return -1;
	}
	else {
		return 0;
	}
	// TODO Auto-generated method stub
	//Student s1=(Student)o;
	
	}
}



