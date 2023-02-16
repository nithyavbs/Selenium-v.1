package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		Actions a= new Actions(driver);
		WebElement primeNav = driver.findElement(By.xpath("//span[text()='Prime']"));
//		WebElement primeNav = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[5]"));
		Thread.sleep(2000);
		a.moveToElement(primeNav).perform();
		Thread.sleep(2000);
		WebElement primeList = driver.findElement(By.xpath("//a//img[@id='multiasins-img-link']"));
		Thread.sleep(2000);
		primeList.click();
		
		

	}

}
