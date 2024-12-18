package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebaySearch {
	
	WebDriver driver;
	
	public void launchBrowser() throws InterruptedException {
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.get("https://www.ebay.com");
	
	}
	
	public void SearchProduct() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("gh-ac")).sendKeys("Speaker");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Daily Deals")).click();
		
	}
	public void navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Title of this page is: "+driver.getTitle());
		
	}
	public void closeBrowser() {
		driver.quit();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ebaySearch obj = new  ebaySearch();
		obj.launchBrowser();
		obj.SearchProduct();
		obj.navigate();
		obj.closeBrowser();
		

	}

}
