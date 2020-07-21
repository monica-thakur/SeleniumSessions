package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropHandle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceElement =driver.findElement(By.id("draggable"));
		WebElement destinationElement = driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		
		//ac.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();
		
		ac.dragAndDrop(sourceElement, destinationElement).build().perform();

	}

}
