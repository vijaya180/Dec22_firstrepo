package variousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	@Before
	public  void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Desktop\\Seleniuim\\crm\\driver\\chromedriver.exe");
		System.out.println("Before");
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			 driver=new ChromeDriver();//oject variable
			driver.manage().deleteAllCookies();
			driver.get("https://techfios.com/billing/?ng=login/");
			driver.manage().window().maximize();
		
	}
	@After
	public  void tearDown() {
		System.out.println("After");
		driver.close();
			driver.quit();	
	}
	@Test
	public  void postiveLoginTest() throws InterruptedException {
		System.out.println("Positive Login");

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void negLoginTst() throws InterruptedException {
		System.out.println("Negative Login");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
}
