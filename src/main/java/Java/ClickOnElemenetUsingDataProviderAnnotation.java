package Java;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnElemenetUsingDataProviderAnnotation {

	@Test(dataProvider="signInMenuTexts")
	public static void checkSignInXpaths(String text) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement signIn = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"));
		 Actions ac = new Actions(driver);
		 ac.moveToElement(signIn).build().perform();
		 Thread.sleep(3000);
		 WebElement target = driver.findElement(By.xpath("//div[@id='nav-al-container']//span[text()='"+ text+"']"));
		 target.click();
		 Thread.sleep(3000);
		 driver.quit();
		 
	}
	@DataProvider(name="signInMenuTexts")
	public static Object[][] signInMenuTexts(){
		
		
		
		String[][]data = {
				
				{"Your Account"},
				{"Your Orders"},
				{"Your Wish List"},
				{"Keep shopping for"},
				{"Your Recommendations"},
				{"Your Prime Membership"},
				{"Your Prime Video"},
				{"Your Subscribe & Save Items"},
				{"Memberships & Subscriptions"},
				{"Your Seller Account"},
				{"Manage Your Content and Devices"},
				{"Register for a free Business Account"},
				{"Create a Wish List"},
				{"Wish from Any Website"},
				{"Baby Wishlist"},
				{"Discover Your Style"},
				{"Explore Showroom"},


			
		};
		
		return data;
		
		
	}
	
}
