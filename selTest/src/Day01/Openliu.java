package Day01;
//�����Ͱ汾���ȸ���߰汾
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
@Test
	//�ڷ�����ǰ��
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
	//����ҳ��
	driver.navigate().back();
	String title1=driver.getTitle();
	System.out.println(title1);
	
//��ӡ��ǰ����ַ
	String url11=driver.getCurrentUrl();
	System.out.println(url11);
	//�������
	driver.manage().window().maximize();
	driver.navigate().to(url2);
	
	Dimension dimension=new Dimension(0,0);
	driver.manage().window().setSize(dimension);
	/*//ˢ��ҳ��
	driver.navigate().refresh();
	driver.navigate().to(url2);
	//ִ����󣬷��ص��ٶ�
	//Thread.sleep(1000);//��ͣ10��
	driver.navigate().forward();;
	//��ӡ����
	String title2=driver.getTitle();
	System.out.println(title2);
	String url22=driver.getCurrentUrl();
	System.out.println(url22);*/
}
}
