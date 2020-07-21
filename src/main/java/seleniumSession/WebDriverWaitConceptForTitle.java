package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptForTitle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");

//		driver.get("https://app.hubspot.com/");
//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
////		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
//
//		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
//		System.out.println(driver.getTitle());

//		String title = doGetPageTitleWithContains(driver, "2", "HubSpot Login");
//		System.out.println(title);

		String title = doGetPageTitleWithTitleIs(driver, 10, "HubSpot Login");
		System.out.println(title);

	}

	public static String doGetPageTitleWithContains(WebDriver driver, String timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		return driver.getTitle();

	}

	public static String doGetPageTitleWithTitleIs(WebDriver driver, long timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public String doGetPageCurrentURL(WebDriver driver, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(value));
		return driver.getCurrentUrl();
	}

}
