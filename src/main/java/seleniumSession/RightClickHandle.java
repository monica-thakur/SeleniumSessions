package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightClickMe = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		
		
//		Actions ac = new Actions(driver);
//		ac.contextClick(driver.findElement(rightClickMe)).perform();

		By rightClickOptions = By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");

//		List<WebElement> rightClickOptionsList = driver.findElements(rightClickOptions);
//
//		System.out.println(rightClickOptionsList.size());

//		for (int i = 0; i < rightClickOptionsList.size(); i++) {
//			String text = rightClickOptionsList.get(i).getText();
//			System.out.println(text);
//
//			if (text.equals("Copy")) {
//				rightClickOptionsList.get(i).click();
//				break;
//			}
//		}

		doActionsRightClick(rightClickMe);
		doActionsRightClickSelectOption(rightClickOptions, "Cut");

	}

	public static void doActionsRightClickSelectOption(By locator, String value) {

		List<WebElement> rightClickOptionsList = driver.findElements(locator);

		for (int i = 0; i < rightClickOptionsList.size(); i++) {
			String text = rightClickOptionsList.get(i).getText();
			if (text.equals(value)) {
				rightClickOptionsList.get(i).click();
				break;
			}
		}

	}

	public static void doActionsRightClick(By locator) {
		Actions ac = new Actions(driver);
		ac.contextClick(driver.findElement(locator)).perform();
	}
}
