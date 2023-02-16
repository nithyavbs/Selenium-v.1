package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ÁctionsCh13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(signIn).perform();
		WebElement seller = driver.findElement(By.xpath("//a//span[text()='Your Seller Account']"));
		a.moveToElement(seller).perform();
		seller.click();

	}

}
