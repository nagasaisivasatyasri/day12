package day12;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringJoiner j=new StringJoiner("-");
j.add("14");
j.add("FEB");
j.add("1999");
System.out.println(j);
StringJoiner j1=new StringJoiner(",","[","]");
j1.merge(j);
System.out.println(j1);
System.out.println(j.length());
System.out.println(j1.setEmptyValue("Satya"));
System.out.println(j.toString());
	}

}
