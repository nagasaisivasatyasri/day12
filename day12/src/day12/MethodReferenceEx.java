package day12;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

class  MathEx{
	
	public static void run(String msg) {
		System.out.println("Run raja run "+msg);
	}
	
}

class ThreadEx{
	public void some() {
	for(int i=1;i<10;i++) {
		System.out.print(i+" ");
	}}
}
interface General{
	Shape getDraw(String msg);
}
class Shape{
	String str;
	Shape(String str){
		this.str=str;
		System.out.println("message");
	}
}
class MethodReferenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c=MathEx::run;
c.accept("Shiva kumar");

General  f=Shape::new;
f.getDraw("Triangle");
Thread t=new Thread(()->{
	for(int i=1;i<20;i++) {
		System.out.print(i+" ");
	}
	System.out.println();
});
t.start();
Thread d=new Thread(new ThreadEx()::some);
//System.out.println();
d.start();
	}
}

