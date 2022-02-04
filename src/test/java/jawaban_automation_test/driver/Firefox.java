package jawaban_automation_test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumWebdriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
