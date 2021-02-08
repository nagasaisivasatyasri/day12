package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al=new ArrayList();
al.add(new Student(23,"satya",67));
al.add(new Student(3,"sai",77));
al.add(new Student(58,"charan",37));
al.add(new Student(34,"parag",27));

List passed=al.stream().filter(s->s.getAvg()>40).collect(Collectors.toList());
System.out.println("Passed students "+passed);
List failed=al.stream().filter(s->s.getAvg()<40).collect(Collectors.toList());
System.out.println("Failed students "+failed);


}

}
