package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnElement {

       public static void main(String[] args) throws InterruptedException {

		Click_On_Elementt();

		}

		private static void Click_On_Elementt() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone");

		WebElement sign = driver.findElement(By.xpath("//div[@id='nav-link-accountList']//button[@class='nav-flyout-button nav-icon nav-arrow']"));
		sign.click();

		Actions act = new Actions(driver);
		   
		   act.moveToElement(sign).perform();
		   signin(driver, "Your Subscribe & Save Items");
		   
		   }

		  public static void signin(WebDriver driver, String value) throws InterruptedException
		 
		  {

		WebElement ele = driver.findElement(By.xpath("//div[@id='nav-al-container']//span[text()='"+value+"']"));
		ele.click();

		}

		

	}

