package work2;

public class A extends Thread{
	
	private Test test;
	
	public A(Test test) {
		this.test=test;
	}
	@Override
	public void run() {
		test.the();
	}
}


