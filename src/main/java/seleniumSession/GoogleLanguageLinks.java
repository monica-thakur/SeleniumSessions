package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// Launch google.co.in and click on language of user's choice on whatever position it is

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		
		languageClick(driver, "Melayu");

	}

	public static void languageClick(WebDriver driver, String langName) {

		List<WebElement> listOfLanguages = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
		for (int i = 0; i < listOfLanguages.size(); i++) {
			String text = listOfLanguages.get(i).getText();
			if (text.equals(langName)) {
				listOfLanguages.get(i).click();
				break;
			}
		}
	}

}