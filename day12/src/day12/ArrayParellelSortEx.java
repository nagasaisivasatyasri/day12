package day12;

import java.util.Arrays;

public class ArrayParellelSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {4,5,6,721,13,45,67};
for(int x:a) {
	System.out.print(x+" ");
}
Arrays.parallelSort(a);
 System.out.println(" ");
 for(int x:a)
 {
	 System.out.print(x+" ");
 }
	}

}
