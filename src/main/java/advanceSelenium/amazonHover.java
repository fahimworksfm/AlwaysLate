package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonHover {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement a = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));

		WebElement b = driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
		
		Actions acts = new Actions(driver);
		
		acts.moveToElement(a).moveToElement(b).click().build().perform();
		
	}

}
