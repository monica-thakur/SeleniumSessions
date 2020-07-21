package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDraggablePresent {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);
		By draggable = By.id("draggable");
		ElementUtil el = new ElementUtil(driver);
		WebElement element = el.getElement(draggable);

		if (element.isDisplayed()) {
			System.out.println("Draggable element present");
		} else {
			System.out.println("Element not present");
		}
	}

}
