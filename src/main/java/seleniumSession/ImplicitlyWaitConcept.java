package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By loginButton = By.xpath("//button[@id='loginBtn']");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/login");
		
		//implicit wait is not waiting other than webelements, like for getTitle it did not wait to diplay the page .r
		System.out.println(driver.getTitle());
		
		driver.findElement(username).sendKeys("monicathakur2.1@gmail.com");
		driver.findElement(password).sendKeys("Test@123456789");
		driver.findElement(loginButton).click();
		
		
	}

}
