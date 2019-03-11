package day201902;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class sizeyunsuanTest {
@Parameters("{data1,data2}")

@DataProvider(name="add")
public Object[][] data(){
	return new Object[][] {{"20","40"},{"8","2"}};
}
	  
@Test(dataProvider="add")
	public void yunsuan(String data1,String data2){
		int a=8;
		int b=2;
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a-b);
		
	}

}
