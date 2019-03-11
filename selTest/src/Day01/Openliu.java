package Day01;
//火狐最低版本，谷歌最高版本
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
@Test
	//在方法的前面
	public void open() throws InterruptedException {
/*System.setProperty("webdriver.chrome.dirver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();*/
	System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	WebDriver driver=new FirefoxDriver();
	String url1="https://www.baidu.com";
	String url2="https://www.baidu.com";
	//driver.get("https://www.baidu.com");
	driver.get(url1);
	driver.navigate().to(url2);
	//后退页面
	driver.navigate().back();
	String title1=driver.getTitle();
	System.out.println(title1);
	
//打印当前的网址
	String url11=driver.getCurrentUrl();
	System.out.println(url11);
	//窗口最大化
	driver.manage().window().maximize();
	driver.navigate().to(url2);
	
	Dimension dimension=new Dimension(0,0);
	driver.manage().window().setSize(dimension);
	/*//刷新页面
	driver.navigate().refresh();
	driver.navigate().to(url2);
	//执行完后，返回到百度
	//Thread.sleep(1000);//暂停10秒
	driver.navigate().forward();;
	//打印标题
	String title2=driver.getTitle();
	System.out.println(title2);
	String url22=driver.getCurrentUrl();
	System.out.println(url22);*/
}
}
