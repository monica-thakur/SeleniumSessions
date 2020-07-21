package seleniumSession;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	public static void main(String[] args) {
		// get total number of links on the page
		// print the text of each link
		// Should not print links which are blank like image etc.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.in");
		
		List<WebElement> listLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(listLinks.size());
		
		for(int i = 0; i<listLinks.size(); i++) {
			
			String text =listLinks.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
