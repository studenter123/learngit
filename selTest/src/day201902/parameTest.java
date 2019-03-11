package day201902;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameTest {
  @DataProvider(name="add")
  public Object[][] data(){
	return new Object[][] {{"20","40"},{"20","30"}};
	  
  }
	  @Test(dataProvider="add")
		@Parameters("{test1,test2}")
		public void p(String test1,String test2) {
			System.out.println(test1);
			System.out.println(test2);
		}

  }

