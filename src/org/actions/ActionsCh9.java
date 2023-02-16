package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		Actions a = new Actions(driver);
		WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(dept).perform();
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		WebElement interior = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interior).perform();
		driver.findElement(By.xpath("//a[text()='Ceiling Paint']")).click();

	}

}
