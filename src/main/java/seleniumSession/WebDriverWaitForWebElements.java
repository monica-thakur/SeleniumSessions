package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForWebElements {

	private static WebElement element;


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By loginButton = By.xpath("//button[@id='loginBtn']");
		
		By proceed = By.name("proceed");

		//driver.get("https://app.hubspot.com/login");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(proceed).click();
		Alert alert = waitForAlertPresent(driver, 5);
		alert.accept();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
		

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("monicathakur2.1@gmail.com");

//		waitForElementPresent(driver, 10, username).sendKeys("monicathakur2.1@gmail.com");
//		driver.findElement(password).sendKeys("Test@123456789");
//		driver.findElement(loginButton).click();
	}

	public static WebElement waitForElementPresent(WebDriver driver, int timeout, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement doElementToBeClickable(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void clickWhenReady(WebDriver driver, int timeout, By locator) {
		WebElement element = doElementToBeClickable(driver, timeout, locator);
		element.click();
	}

	
	public static Alert waitForAlertPresent(WebDriver driver, int timeout ) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	public static void waitForElementToBeVisible(WebDriver driver, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
