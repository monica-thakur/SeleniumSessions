package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsID {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/");
		Thread.sleep(5000);

		/**
		 * This is method 1: general method
		 */
//		driver.findElement(By.id("username")).sendKeys("monica@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test@123");
//		driver.findElement(By.id("loginBtn")).click();

		/**
		 * This is method 2: Storing WebElement separately and performing actions on it
		 */

//		WebElement username = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement login = driver.findElement(By.id("loginBtn"));
//		
//		username.sendKeys("monica@gmail.com");
//		password.sendKeys("Test@123");
//		login.click();

		/**
		 * This is method 3: Store all the By's and perform action accordingly
		 */

		By username = By.id("username");
		By password = By.id("password");
		By button = By.id("loginBtn");
//		
//		driver.findElement(username).sendKeys("monica@gmail.com");
//		driver.findElement(password).sendKeys("test@123");
//		driver.findElement(button).click();

		/**
		 * This is method 4: create getElement fucntion which will return element based
		 * on given by
		 */

//		getElement(username).sendKeys("monica@gmail.com");
//		getElement(password).sendKeys("test@123");
//		getElement(button).click();

		sendKeys(username, "Monica@gmail.com");
		sendKeys(password, "test@123");
		doClick(button);

		driver.quit();
	}

	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void sendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
