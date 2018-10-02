package Day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\installation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://qatechhub.com");

	}

	public String getPageTitle() {

		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();

	}

}
