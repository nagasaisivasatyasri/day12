package com.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.question3.Student;

public class StreamEx2 {

	public static void main(String[] args) throws ClassCastException {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList();
		al.add(new Student(23,"satya",67));
		al.add(new Student(3,"sai",77));
		al.add(new Student(58,"charan",37));
		al.add(new Student(34,"parag",27));
		Object []in=al.stream().filter(s->s.getAvg()>40).toArray();
		for(int i=0;i<in.length;i++) {
		System.out.println(in[i]);}
		long out=al.stream().count();
		System.out.println(out);
	     List l=al.stream().filter(s->s.getId()%2==0).collect(Collectors.toList());
	     System.out.println(l);
	    ArrayList<Integer> al1=new ArrayList();
	    al1.add(56);
	    al1.add(6);
	    al1.add(5);
	    al1.add(56);
	    al1.add(65);
	    List l3=al1.stream().distinct().collect(Collectors.toList());
	    System.out.println(l3);
	    Integer l2=al1.stream().max((i,j)->(i>j)?1:(i<j)?-1:0).get();
	    System.out.println(l2);
	    Student s=al.stream().max((i,j)->(i.getAvg()>j.getAvg())?-1:(i.getAvg()>j.getAvg()?1:0)).get();
	    System.out.println(s);
	    Student s1=al.stream().min((i,j)->(i.getAvg()>j.getAvg())?-1:(i.getAvg()>j.getAvg()?1:0)).get();
	    System.out.println(s1);
	    List list=al1.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
	    System.out.println(list);
	    List list1=al1.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
	    System.out.println(list1);
	    al.forEach((x)->System.out.println(x));
	    System.out.println(al.stream().findFirst());
	    System.out.println(al1.stream().map(x->x+5).collect(Collectors.toSet()));
	    System.out.println(al.stream().map(x->x.getAvg()+5).collect(Collectors.toSet()));
	    //System.out.println(al.stream().sorted)).collect(Collectors.toList()));
		int even = al1.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> i);
		  System.out.println(even); 
		
	    System.out.println(al);
	    
	     
	     
		
	}

}
