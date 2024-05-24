package work2;

import java.util.Random;

public class Test {
	
	static int sun=100;
	int s=new Random().nextInt(10);
	public void the() {
		while(true) {
			if(sun >= 100) {
				synchronized ("s") {
					try {
						"s".wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else {
				sun=sun+100;
				System.out.println("正在进货，还剩"+sun+"件");
		    }			
		}
	}
	
	public void thes() {
		while(true) {
			if(sun<=20) {
				synchronized ("s") {
					"s".notify();
				}
			}
			else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sun=sun-s;
				System.out.println("正在出售，还剩"+sun+"件");
			}
		}
	}
}
