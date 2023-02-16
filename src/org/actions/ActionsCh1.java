package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Actions ac = new Actions(driver);
		WebElement bankElt = driver.findElement(By.xpath(" //a[text()=' BANK '] "));
		WebElement debitAcc = driver.findElement(By.xpath(" (//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(bankElt, debitAcc).perform();
//		Thread.sleep(2000);
		WebElement saleElt = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement creditAcc = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		ac.dragAndDrop(saleElt, creditAcc).perform();

		WebElement amt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement debitAmt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(amt, debitAmt).perform();
		Thread.sleep(3000);
		WebElement amt2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement creditAmt = driver.findElement(By.xpath("//li[@class='placeholder']"));
		ac.dragAndDrop(amt2, creditAmt).perform();
	}

}
