package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	postiveLoginTest();
	tearDown();
	launchBrowser();
	negLoginTst();
	tearDown();
}
public static void launchBrowser() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Desktop\\Seleniuim\\crm\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//oject variable
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		
			
}
public static void tearDown() {
	driver.close();
		//driver.quit();	
}
public static void postiveLoginTest() throws InterruptedException {

	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
}
public static void negLoginTst() throws InterruptedException {

	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc12345");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
}
public static void negLoginTst1() throws InterruptedException {

	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc12345");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
}
public static void negLoginTst2() throws InterruptedException {

	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc12345");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
}
}
