package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Actions a = new Actions(driver);
		WebElement womenF = driver.findElement(By.xpath("(//li//a//span[@class='catText'])[2]"));
		a.moveToElement(womenF).perform();
		WebElement footWear = driver.findElement(By.xpath("(//p//a//span[text()='Footwear'])[2]"));
		a.moveToElement(footWear).perform();
		footWear.click();
		driver.findElement(By.xpath("//div[text()='Heels for Women']")).click();

	}

}
