package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		Thread.sleep(5000);

		WebElement login = driver.findElement(By.id("ctl00_HyperLinkLogin"));

		Actions ac = new Actions(driver);
		ac.moveToElement(login).perform();

		Thread.sleep(3000);

		WebElement spiceClubButton = driver.findElement(By.linkText("SpiceClub Members"));

		ac.moveToElement(spiceClubButton).perform();

		Thread.sleep(2000);

		WebElement memberLogin = driver.findElement(By.linkText("Member Login"));

		ac.click(memberLogin).perform();
	}
}
