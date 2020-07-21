package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);

		String text = alert.getText();
		System.out.println(text);

		alert.accept();// This will click on OK button
		// alert.dismiss();// This will close the alert

		driver.switchTo().defaultContent();//This will point driver to previous page

	}

}
