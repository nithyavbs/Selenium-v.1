package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Actions a = new Actions(driver);
		WebElement mobileAc = driver.findElement(By.xpath("//div//span[text()='Mobile & Accessories']"));
		a.moveToElement(mobileAc).perform();
		WebElement topSell = driver.findElement(By.xpath("//a//span[text()='Top Selling Wearables']"));
		topSell.click();
		
	}

}
