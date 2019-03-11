package day201902;

import org.testng.annotations.Test;

public class time {
	@Test(timeOut=2000)
	public  void add() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("hello world");
	}

}
