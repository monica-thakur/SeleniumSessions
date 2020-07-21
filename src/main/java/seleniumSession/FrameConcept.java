package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.htmll");

		/**
		 * two switch methods to switch to frames.
		 * Frame is also a web element 
		 * iframe /frame is same thing
		 */
		
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		WebElement element = driver.findElement(By.tagName("h2"));
		
		System.out.println(element.getText());
	}

}
