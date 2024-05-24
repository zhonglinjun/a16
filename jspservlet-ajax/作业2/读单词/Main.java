package work3;

import java.io.File;
import java.util.Arrays;

public class Main {
	static int sun=0;
	public static void main(String[] args) throws Exception {
		
		String file =("C:\\Users\\Administrator\\Desktop\\aa");
		File the=new File(file);
		
		File[] thes=the.listFiles();
		
		int a=thes.length;
		int b= a/2;
		
		Test test=new Test(Arrays.copyOfRange(thes, 0, b));
		test.start();
		
		Test test2=new Test(Arrays.copyOfRange(thes, b, thes.length));
		test2.start();
		
		test.join();
		test2.join();
		
		System.out.println(Main.sun);
	}
}
