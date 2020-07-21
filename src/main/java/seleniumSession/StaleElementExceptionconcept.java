package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionconcept {
	
	/**
	 * Here, driver is first pointing to elements of first page. After refresh a new page is opened
	 * Now we have to again point driver to new page
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/");
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.id("username"));

		element.sendKeys("monica@gmail.com");
		driver.navigate().refresh();

		element = driver.findElement(By.id("username"));

	}

}
