package jawaban_automation_test.run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jawaban_automation_test.driver.DriverSingleton;
import jawaban_automation_test.pages.CreateGist;
import jawaban_automation_test.pages.DeleteGist;
import jawaban_automation_test.pages.EditGist;
import jawaban_automation_test.pages.Login;
import jawaban_automation_test.pages.Logout;

public class mainApp {
	
	Login login;
	CreateGist create;
	EditGist edit;
	DeleteGist delete;
	Logout logout;
	
	@BeforeSuite
	public void launchApp() {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://gist.github.com/");
		login = new Login();
		create = new CreateGist();
		edit = new EditGist();
		delete = new DeleteGist();
		logout = new Logout();
	}
	
	@Test
	public void login() {
		login.login();
		create.Create();
		edit.Edit();
		delete.Delete();
		logout.LogoutAkun();
	}
}
