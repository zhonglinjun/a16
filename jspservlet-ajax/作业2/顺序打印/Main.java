package work1;

public class Main {
	public static void main(String[] args) throws Exception {
		Test sk=new Test();
		
		A a= new A(sk,"a","b","1");
		A b= new A(sk,"b","c","2");
		A c= new A(sk,"c","a","3");
		
		a.start();
		Thread.sleep(1100);
		b.start();
		Thread.sleep(1100);
		c.start();
		
		
	}
}
