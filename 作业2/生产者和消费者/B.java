package work2;

public class B extends Thread{

private Test test;
	
	public B(Test test) {
		this.test=test;
	}
	@Override
	public void run() {
		test.thes();
	}
}
