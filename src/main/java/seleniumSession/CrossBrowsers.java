package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//shortcut to generate import statements>>>> command + shift + o

public class CrossBrowsers {
	
	

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/monica/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "/Users/monica/Downloads/geckodriver");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("driver not found");
		}
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
