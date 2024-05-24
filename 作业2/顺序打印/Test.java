package work1;

public class Test {

public void test(String s,String e,String name) throws Exception {
		
		while(true) {
			
			synchronized (s) {
				Thread.sleep(1000);
				synchronized (e) {
					e.notify();
				}
				s.wait();
				System.out.println(name);
			}							
		}
	}						
}
