package com.question1;

import java.util.Scanner;
import java.util.TreeSet;

public class LambdaExpreesionEx {
	public static void main(String[] args) {
		TreeSet ex = new TreeSet((obj1, obj2) -> {
			Student s = (Student) obj1;
			Student s1 = (Student) obj2;
			if (s.getStudentname().compareTo(s1.getStudentname()) > 0)
			{
				return -1;
			} 
			else if (s.getStudentname().compareTo(s1.getStudentname()) < 0) 
			{
				return 1;
			}
			else
			{
				return 0;
			}

		});
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			ex.add(new Student(s.nextInt(), s.next()));
		}
		System.out.println(ex);

	}

}
