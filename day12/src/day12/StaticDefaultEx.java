package day12;
interface Greetings{
	public void greet();
	default void service() {
		System.out.println("This is default method pf interface");
	}
	static void display()
	{
		System.out.println("This is static method of greetings");
	}
}
class Greetings1 implements Greetings{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Greeting by Greetings! class");
	}
	
}
class Greetings2 implements Greetings{
	static void eat() {
		System.out.println("Eat method");
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}
}
public class StaticDefaultEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greetings g=Greetings::display;//calling a static method
g.greet();
	}

}
