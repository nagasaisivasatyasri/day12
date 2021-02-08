package com.question4;

public class Student {
private int id;
private String name;
private int avg;
public Student(int id, String name, int avg) {
	//super();
	this.id = id;
	this.name = name;
	this.avg = avg;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAvg() {
	return avg;
}
public void setAvg(int avg) {
	this.avg = avg;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", avg=" + avg + "]";
}

}
