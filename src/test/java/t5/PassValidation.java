package t5;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
yazeeddiab-314744228
mohamedagpareh-211405568
 */
 
public class PassValidation {
	 static WebDriver  browser;
		
	@Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		      browser.get(url);
		
	  }
	
	 @Test
		public void Tests1() {
		 browser.findElement(By.name("characters")).sendKeys("Yazeed2*");
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value");
		 System.out.println(result);
		 String Expected= "Valid Value";
	     assertEquals(Expected,result);
	 }
	 
	 @Test
		public void Tests2() {
		 browser.findElement(By.name("characters")).sendKeys("Yazeed2*s");
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value");
		 System.out.println(result);
		 String Expected= "Invalid Value";
	     assertEquals(Expected,result);
	 }
	 @Test
		public void Tests3() {
		 browser.findElement(By.name("characters")).sendKeys("diab2222");
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value");
		 System.out.println(result);
		 String Expected= "Invalid Value";
	     assertEquals(Expected,result);
	 }
	 
	 @Test
		public void Tests4() {
		 browser.findElement(By.name("characters")).sendKeys("mohamed21");
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value");
		 System.out.println(result);
		 String Expected= "Invalid Value";
	     assertEquals(Expected,result);
	 }
}