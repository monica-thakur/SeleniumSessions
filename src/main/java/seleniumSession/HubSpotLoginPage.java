package seleniumSession;

public class HubSpotLoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverFactory wf = new WebDriverFactory();
		wf.getDriver("Chrome");
		wf.launchURL("https://app.hubspot.com/login");
		Thread.sleep(5000);
		System.out.println(wf.getTitle());
		wf.closeBrowser();
	}
}
