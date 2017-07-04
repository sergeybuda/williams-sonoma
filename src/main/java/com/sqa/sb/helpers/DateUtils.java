package com.sqa.sb.helpers;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public final class DateUtils {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "G:\\Selenium\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement ele : allDates) {
			String date = ele.getText();
			if (date.equalsIgnoreCase("28")) {
				ele.click();
				break;
			}
		}
	}
}