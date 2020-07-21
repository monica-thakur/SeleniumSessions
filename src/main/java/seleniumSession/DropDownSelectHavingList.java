package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectHavingList {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_submitForm_Country");

	}

	public static void getDropDownOptionsValue(By locator) {
		
		List<String> optionsList = new ArrayList<String>();
		
		WebElement element =getElement(locator);
		
		Select select = new Select(element);
		List<WebElement> dropList = select.getOptions();
		System.out.println(dropList.size());

		for (int i = 0; i < dropList.size(); i++) {
			 String text = dropList.get(i).getText();
			optionsList.add(text);
		}
	}
		
	public static WebElement getElement(By locator) {
			WebElement element = driver.findElement(locator);
			return element;
	}

}
