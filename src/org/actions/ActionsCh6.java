package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lh.inmakesedu.com/home");
		Actions a = new Actions(driver);
		WebElement mouseOver = driver.findElement(By.xpath("//a//img[@class='svg-xs mr-1']"));
		a.moveToElement(mouseOver).perform();
		WebElement mouseOver2 = driver.findElement(By.xpath("//div//button//p[text()='Software Testing Tamil']"));
		a.moveToElement(mouseOver2).perform();
		driver.findElement(By.xpath("//div//a[text()='ST Master Class']")).click();
	}

}
