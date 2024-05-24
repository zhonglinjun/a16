package work3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test extends Thread{
	
	private File[] thes;


	public Test(File[] thes) {
		this.thes=thes;
		
	}
	
	@Override
	public void run() {
		
		for (File file : thes) {
			try {
				FileInputStream she=new FileInputStream(file);
				byte[] b=new byte[she.available()];
				she.read(b);
				
				String sk=new String(b);
				int ak=sk.split(" ").length;
				
				add(ak);
				
				she.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void add(int ak) {
		synchronized ("a") {
			Main.sun=Main.sun+ak;
		}
		
	}
}
