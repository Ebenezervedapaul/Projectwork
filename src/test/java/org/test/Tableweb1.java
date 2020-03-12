package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tableweb1 extends BaseClass {
 public static void main(String[] args) throws Throwable {
	 launchchrome();
		url("https://demoqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		System.out.println(trows.size());
		for (int i = 0; i <trows.size(); i++) {
			WebElement row = trows.get(i);
		   List<WebElement> tdata = row.findElements(By.tagName("th"));
		for (int j = 0; j < tdata.size(); j++) {
			WebElement cell = tdata.get(j);
	     String text = cell.getText();
	     System.out.println(text);
}
		}
 }
}