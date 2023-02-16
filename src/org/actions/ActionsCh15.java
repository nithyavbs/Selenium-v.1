package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.flipkart.com/toysclp-store?fm=neo%2Fmerchandising&iid=M_75becc3f-71cd-4f60-8ec0-70959ccfa61c_1_372UD5BXDFYS_MC.A6A2ZZGHEZUT&otracker=hp_rich_navigation_6_1.navigationCard.RICH_NAVIGATION_Beauty%252C%2BToys%2B%2526%2BMore~Toys%2B%2526%2BSchool%2BSupplies_A6A2ZZGHEZUT&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L1_view-all&cid=A6A2ZZGHEZU";
		driver.get(url);
		Actions a = new Actions(driver);
//		WebElement closeBtn = driver.findElement(By.xpath("//button[text()='✕']"));
//		closeBtn.click();
		WebElement kids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(kids).perform();
		Thread.sleep(2000);
		WebElement toys = driver.findElement(By.xpath("//div//a[@title='Remote Control Toys']"));
		a.moveToElement(toys).perform();
		toys.click();

	}

}
