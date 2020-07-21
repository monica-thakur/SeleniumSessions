package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManager {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println("driver not found");
		}
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
