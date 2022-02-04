package jawaban_automation_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jawaban_automation_test.driver.DriverSingleton;

public class EditGist {
	private WebDriver driver;

	public EditGist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[1]/a")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//input[@name='gist[description]']")
	private WebElement txtDescription;

	@FindBy(xpath = "//input[@name='gist[contents][][name]']")
	private WebElement txtFilename;

	@FindBy(xpath = "//*[@id=\"code-editor\"]/div/pre")
	private WebElement txtIsi;

	@FindBy(xpath = "//*[@id=\"edit_gist_114537943\"]/div/div[2]/button")
	private WebElement btnUpdate;


	public void Edit() {		
		btnEdit.click();
		
		txtDescription.sendKeys("Hello World 123");
		txtFilename.sendKeys("Hello World 123");
		txtIsi.click();
		txtIsi.sendKeys("test 123");
		btnUpdate.click();

	}
}
