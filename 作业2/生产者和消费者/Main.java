package work2;

public class Main {
	
	public static void main(String[] args) {
		Test s=new Test();
		
		A a=new A(s);
		B b=new B(s);
		
		a.start();
		b.start();
		
	}
}
