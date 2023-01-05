package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("(//img[@id='angular'])[1]"));
		
		WebElement to = driver.findElement(By.xpath("//div[@class='dragged']"));

		Actions act = new Actions(driver) ;
		
		act.dragAndDrop(from, to).perform();
		
		//Thread.sleep(3000);
		
		driver.close();
	}

}



