package t5;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class triangletest {
static WebDriver  browser;
	
/*
yazeeddiab-314744228
mohamedagpareh-211405568
 */
	
	@Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
		      browser.get(url);
		
	  }
	
	 @Test
		public void NotTriangle() {
		 browser.findElement(By.id("side1")).sendKeys("7");
		 browser.findElement(By.id("side2")).sendKeys("2");
		 browser.findElement(By.id("side3")).sendKeys("3");
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText();
		 System.out.println(result);	
		 String Expected= "Error: Not a Triangle";
	     assertEquals(Expected,result);
	 }

	 @Test
		public void Equilateral() {
		 browser.findElement(By.id("side1")).sendKeys("2");
		 browser.findElement(By.id("side2")).sendKeys("2");
		 browser.findElement(By.id("side3")).sendKeys("2");
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText();
		 System.out.println(result);	
		 String Expected= "Equilateral";
	     assertEquals(Expected,result);
	 }
	    
	 @Test
		public void isosceles() {
		 browser.findElement(By.id("side1")).sendKeys("2");
		 browser.findElement(By.id("side2")).sendKeys("2");
		 browser.findElement(By.id("side3")).sendKeys("3");
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText();
		 System.out.println(result);	
		 String Expected= "Isosceles";
	     assertEquals(Expected,result);
	 }

	 @Test
		public void Scalene() {
		 browser.findElement(By.id("side1")).sendKeys("2");
		 browser.findElement(By.id("side2")).sendKeys("3");
		 browser.findElement(By.id("side3")).sendKeys("4");
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText();
		 System.out.println(result);	
		 String Expected= "Scalene";
	     assertEquals(Expected,result);
	 }

}
