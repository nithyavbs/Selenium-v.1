package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(signIn).perform();
	
		WebElement regNew = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		regNew.click();
		WebElement formName = driver.findElement(By.xpath("//input[@placeholder='First and last name']"));
		formName.sendKeys("Nithya");
		WebElement formNo = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
		formNo.sendKeys("7708443003");
		WebElement formEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		formEmail.sendKeys("nithivbs@gmail.com");
		WebElement formPwd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		formPwd.sendKeys("qwerty");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
}
