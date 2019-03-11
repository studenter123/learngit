package Test;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test01 {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="F:\\软件测试\\娟姐\\autotest.html";
		driver.get(url);
		WebElement a=driver.findElement(By.name("account"));
		a.sendKeys("佩奇");
		WebElement a1=driver.findElement(By.name("password"));
		a1.sendKeys("123456");
		//下拉选择
		WebElement b=driver.findElement(By.id("areaID"));
		Select b1=new Select(b);
		b1.selectByIndex(2);
		//性别
		WebElement sex=driver.findElement(By.name("u2"));
		sex.click();
		//四季
		WebElement siji=driver.findElement(By.id("u2"));
		siji.click();
		WebElement siji2=driver.findElement(By.id("u3"));
		siji2.click();
		WebElement siji3=driver.findElement(By.id("u4"));
		siji3.click();
		
		//选择文件
		String wenjian="F:\\MYSQL作业.docx";
		WebElement wen=driver.findElement(By.name("file"));		
		wen.sendKeys(wenjian);
		
		
		//点击按钮
		WebElement an=driver.findElement(By.id("buttonID"));
		an.click();
		Alert p=driver.switchTo().alert();
		Thread.sleep(1000);
		p.accept();
	
		
		
		
	}

}
