package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/");

		Thread.sleep(5000);

		By username = By.id("username");
		By password = By.id("password");
		By button = By.id("loginBtn");

//		Actions ac = new Actions(driver);
//		ac.sendKeys(driver.findElement(username), "test@gmail.com").perform();
//		ac.sendKeys(driver.findElement(password), "test@123").perform();
//		ac.click(driver.findElement(button)).perform();
		
		doActionsSendKeys(username, "abc@gmail.com");
		doActionsSendKeys(password, "test@123");
		doActionsClick(button);

	}

	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void doActionsClick(By locator) {
		Actions ac = new Actions(driver);
		ac.click(getElement(locator)).perform();
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions ac = new Actions(driver);
		ac.sendKeys(getElement(locator), value).perform();
	}

}
