package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag {

	static WebDriver driver;

	public static void main(String[] args) {
		     

		//WebElement day = driver.findElement(By.id("day"));

		/**
		 * method 1: by storing webelement , creating select class object and perform
		 * actions on it
		 */
//		 Select select = new Select(day);
//		 select.selectByVisibleText("10");
//		 select.selectByIndex(5);
//		 select.selectByValue("17");
		 
//		 List<WebElement> dayList = select.getOptions();	
//		 System.out.println(dayList);

		/**
		 * method 2: store by locators and create generic methods 
		 */
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

//		doSelectByVisibleText(day, "12");
//		doSelectByVisibleText(month, "Jun");
//		doSelectByVisibleText(year, "2001");

		doSelectByIndex(day, 1);
		doSelectByIndex(month, 1);
		doSelectByIndex(year, 1);

		doSelectByValue(day, "3");
		doSelectByValue(month, "2");
		doSelectByValue(year, "2018");

	}

	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public static void doSelectByIndex(By locator, int value) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(value);
	}

	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
