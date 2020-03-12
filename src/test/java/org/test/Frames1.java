package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;
import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Enter;

public class Frames1 extends BaseClass{
	public static void main(String[] args) throws Throwable {
	launchchrome();
	url("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	search.sendKeys("iphone11",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[@title='Apple iPhone 11 Pro Shock Proof Case ANTBULL - Transparent']")).click();
	String parent = driver.getWindowHandle();
//	
//	Set<String> total = driver.getWindowHandles();
//	for (String x : total) {
//		if(!parent.equals(x));
//	System.out.println(x);
	
	driver.switchTo().window(parent);
	Set<String> all = driver.getWindowHandles();
	List<String> li = new ArrayList<String>();
	int s =li.size();
	li.addAll(all);
	driver.switchTo().window(li.get(1));
	driver.findElement(By.xpath("//div[@class='view-str-cls marT5']")).click();
	}
	   
	     }