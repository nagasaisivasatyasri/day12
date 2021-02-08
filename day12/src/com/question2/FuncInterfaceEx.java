package com.question2;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Consumer;
public class FuncInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Integer,String> f=(b)->{
	int flag=0;
	String res = null;
	//Integer j=(Integer)b;
	for(int i=2;i<b;i++) {
		if(b%i==0) {
			flag=1;
			break;
		}
		if(flag==1) {
			res="Not a prime";
			
		}
		else {
			res="prime";
			//System.out.println("prime");
		}
	}
	return res;
	
	
};
Function<Integer,String> f1=(b)->{
	 int r,sum=0,temp;    
	   String res=null;
	 // Integer n=(Integer)b;
	  temp=b;    
	  while(b>0){    
	   r=b%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   b=b/10;    
	  }    
	  if(temp==sum)    
		  res="Palindrome";
	  else    
		  res="Not a palindrome";
	  return res;
};
Function<int[],Integer> f2=(n)->{
	Integer flag=0;
	
	//int n[]=(int[])b;
	for(int i=0;i<n.length;i++) {
	flag=flag+n[i];
	}
		
	return flag;
	
	
};
Function<int[],Integer> f3=(n)->{
	Integer flag=0;
	
	//int n[]=(int[])b;
	for(int i=0;i<n.length;i++) {
	flag=flag+n[i];
	}
		
	return flag;
	
	
};
Consumer<int[]> c=(b)->{
	int max=b[0];
	int min=b[0];
	for(int x:b) {
		if(x<min) {
			min=x;}
		if(x>max) {
			max=x;}
	}
	System.out.println("maximum "+max);
	System.out.println("minimum "+min);
};
BiFunction<Integer,Integer,String> bf=(a,b)->{
	return "addition= "+(a+b)+" Subtraction= "+(a-b)+" Multilplication="+(a*b);
};
System.out.println(f.apply(29));
System.out.println(f1.apply(151));
System.out.println(f1.apply(150));
int n[]= {6,7,8,25};
System.out.println(f2.apply(n));
c.accept(n);
System.out.println(bf.apply(15, 20));
}
}



