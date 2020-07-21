package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	public static void main(String[] args) {

		WebDriverFactory wf = new WebDriverFactory();
		WebDriver driver = wf.getDriver("Chrome");
		wf.launchURL("https://www.orangehrm.com/orangehrm-30-day-trial/");
		wf.getTitle();

		ElementUtil util = new ElementUtil(driver);

		By FirstName = By.name("FirstName");
		By LastName = By.name("LastName");
		By Email = By.name("Email");
		By JobTitle = By.name("JobTitle");
		By NoOfEmployees = By.id("Form_submitForm_NoOfEmployees");
		By CompanyName = By.name("CompanyName");
		By Industry = By.name("Industry");
		By Contact = By.name("Contact");
		By Country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		By checkbox = By.name("SetDummyData"); 
		By submit = By.id("Form_submitForm_action_request");

		util.doSendKeys(FirstName, "Monica");
		util.doSendKeys(LastName, "Thakur");
		util.doSendKeys(Email, "monica@gmail.com");
		util.doSendKeys(JobTitle, "Sr Test Engineer");
		util.doSelectByValue(NoOfEmployees, "51 - 75");
		util.doSendKeys(CompanyName, "Aritstocrat");
		util.doSelectByValue(Industry, "Government-National/Federal");
		util.doSendKeys(Contact, "99990000");
		util.selectValueFromDropDown(Country, "Spain");
		util.doClick(checkbox);
		util.doClick(submit);

	}
}
