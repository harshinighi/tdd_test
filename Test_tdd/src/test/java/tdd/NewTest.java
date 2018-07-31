package tdd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
	  driver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
	  
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  Thread.sleep(10000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","E:\\gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("http://ec2-18-220-4-236.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
		driver.manage().window().maximize();
		
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
