package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorName {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");

		/**
		 * method 1:
		 */
//		driver.findElement(By.name("username")).sendKeys("abc");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div/input")).click();

		/**
		 * method 2: storing webElement
		 */

//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div/input"));
//
//		username.sendKeys("abc");
//		password.sendKeys("test@123");
//		loginButton.click();

		/**
		 * method 3: storing by locators and creating fucntions
		 */

		By username = By.name("username");
		By password = By.name("password");
		
		doSendKeys(username, "monica");
		

	}

	public static WebElement getElement(By locator) {
		WebElement element  = driver.findElement(locator);
		return element;
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	
	
}
