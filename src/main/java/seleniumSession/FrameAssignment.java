package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");
		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//*[@id=\'loginForm\']/div/div/input");

		ElementUtil el = new ElementUtil(driver);

		el.doSendKeys(username, "batchautomation");
		el.doSendKeys(password, "Test@12345");
		el.doClick(loginButton);

		driver.switchTo().frame("mainpanel");

		By contactHeader = By.xpath("//*[@id=\'navmenu\']/ul/li[4]/a");
		By logoutButton = By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a");

		WebElement element = el.getElement(contactHeader);

		el.doClick(contactHeader);
		el.doClick(logoutButton);
	}
}
