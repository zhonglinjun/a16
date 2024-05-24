package work1;

public class A extends Thread{
	private String s;
	private String e;
	private String name;
	private Test test1;
	
	public A(Test test1,String s , String e , String name) {
		this.test1 = test1;
		this.s=s;
		this.e=e;
		this.name=name;
	}
	@Override
	public void run() {
		try {
			test1.test(s,e,name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
