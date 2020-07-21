package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValueWithoutSelectClass {
	
	/**
	 * For selecting value from dropdown without select class we need to create locator using all the options.
	 */
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		/**
		 * Below By.id will not work as this is not representing list of options 
		 */
		//By countryOptions = By.id("Form_submitForm_Country");
		
		selectValueFromDropDown(driver, countryOptions, "India");

	}

	public static void selectValueFromDropDown(WebDriver driver, By locator, String value) {
		List<WebElement> country = driver.findElements(locator);

		for (int i = 0; i < country.size(); i++) {
			String text = country.get(i).getText();
			if (text.equals(value)) {
				country.get(i).click();
				break;
			}
		}
	}

	
	
	
}
