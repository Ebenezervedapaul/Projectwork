package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass
{
   static ChromeDriver driver;	
   
   public static void launchchrome() {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SampleMaven\\Datas\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
  
   }  
   public static void url(String url) throws InterruptedException {
		driver.get( url);
		Thread.sleep(3000);
		}
		
		public static void getTitle() {
			String Title = driver.getTitle();
			System.out.println(Title);
		}
		
		private void getCurrenturl() {
			String currentUrl= driver.getCurrentUrl();
		}
		
		private void Insert(WebElement e,String value) {
	    e.sendKeys(value);
		}
		
		public static void click(WebElement c) {
	    c.click();
		}
		
		public static void doubleclick(WebElement dc) {
	    Actions ac= new Actions(driver);
	    ac.doubleClick(dc);
		}
		
		public static void rightclick(WebElement right) {
	    Actions ac = new Actions(driver);
	    ac.contextClick(right);
		}
		
		//public static void robot() throws AWTException {
	  //  Robot r = new Robot();
	   // r.keyPress(KeyEvent.VK_ENTER);
	   
	    //public static void jse(WebElement ex) {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	    
		
		public static void alertt()
		{
		Alert alert = driver.switchTo().alert();	
		}	
		
	    }
