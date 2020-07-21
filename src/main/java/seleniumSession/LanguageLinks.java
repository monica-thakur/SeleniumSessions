package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {
	/**
	 * Here we are clicking on each language one by one. As webElements change on
	 * every click so we are updating webelement list after every click
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/?gws_rd=ssl");

		List<WebElement> langList = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));

		for (int i = 0; i < langList.size(); i++) {
			System.out.println(langList.get(i).getText());

			langList.get(i).click();

			langList = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
		}

	}

}
