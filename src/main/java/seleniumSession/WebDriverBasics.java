package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/monica/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();// launch browser

		driver.get("https://www.google.com"); // enter url

		String title = driver.getTitle();
		System.out.println("Page title is:" + title); // get title

		// checkpoint:verification point
		if (title.equals("Google")) {
			System.out.println("Correct title"); // print on console
		} else {
			System.out.println("Incorrect title");
		}

		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
		if(URL.contains("google")) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
		
		driver.getTitle();
	}
	

}
