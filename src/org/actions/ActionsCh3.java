package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Actions a = new Actions(driver);
		WebElement closeBtn = driver.findElement(By.xpath("//button[text()='✕']"));
		closeBtn.click();
		WebElement homeElt = driver.findElement(By.xpath("//div[text()='Home']"));
		a.moveToElement(homeElt).perform();
		driver.findElement(By.xpath("//a[text()='Bath linen']")).click();

	}

}
