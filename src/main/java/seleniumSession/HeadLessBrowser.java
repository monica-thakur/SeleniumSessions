package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//headless browser is when no browser gets launched
		//testing is happening behind the scene
		//fast: yes
		//headed browser - when browser is launched
		
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
