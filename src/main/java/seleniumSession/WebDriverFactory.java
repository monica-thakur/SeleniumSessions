package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {

	WebDriver driver;

	/**
	 * 
	 * @param browser
	 * @return driver
	 */
	public WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println("Enter correct browser");
		}
		return driver;
	}
	
	/**
	 * 
	 * @param url
	 */

	public void launchURL(String url) {
		driver.get(url);
	}
	
	/**
	 * 
	 * @return 
	 */

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.quit();
	}
}
